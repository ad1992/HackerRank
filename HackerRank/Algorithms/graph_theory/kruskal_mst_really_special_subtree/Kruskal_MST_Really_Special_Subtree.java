package graph_theory.kruskal_mst_really_special_subtree;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Kruskal_MST_Really_Special_Subtree {

		private static Comparator<Edge> comp=new Comparator<Edge>() {

			@Override
			public int compare(Edge x, Edge y) {
				if(x.w>y.w)
					return 1;
				if(x.w<y.w)
					return -1;
				return 0;
			}
		};
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s;
	        StringTokenizer st;
			s=br.readLine().trim();    	        
	  	  	st=new StringTokenizer(s," ");
	        int N=Integer.parseInt(st.nextToken());
	        int M=Integer.parseInt(st.nextToken());
	        Graph g=new Graph(N+1,M+1);       
			
	        for(int i=1;i<=M;i++)
	        {
	      	  	  s=br.readLine().trim();    	    	         
	      		  st=new StringTokenizer(s);
		          int v1=Integer.parseInt(st.nextToken());
		          int v2=Integer.parseInt(st.nextToken());
		          int w=Integer.parseInt(st.nextToken());
		          g.edges[i]=new Edge(v1,v2,w);		        
		         
		          
	        }
	      int start=Integer.parseInt(br.readLine().trim());
	      long ans= KrushkalMST(g);
	      System.out.println(ans);

		}
		private static long  KrushkalMST(Graph g) {
			
			Arrays.sort(g.edges,1,g.M,comp);
			
			long minweight=0l;			
			int index=1;
			int i=0;
			Subset subsets[]=new Subset[g.N];
	        for(i=1;i<subsets.length;i++)
	        {
	        	subsets[i]=new Subset(i,0);
	        }
	        i=1;
	        while(index<g.N-1)
			{
				int x=find(subsets,g.edges[i].v1);
				int y=find(subsets,g.edges[i].v2);
				if(x!=y)
				{
					
					minweight+=g.edges[i].w;
					union(subsets,x,y);
					index++;
				}	
				i++;
			}
	       
			return minweight;
		}
		
		private static void union(Subset[] subsets, int x, int y) {
			if(subsets[x].rank>subsets[y].rank)
			{
				subsets[y].parent=x;
			}
			else if(subsets[x].rank<subsets[y].rank)
			{
				subsets[x].parent=y;
			}
			else
			{
				subsets[x].parent=y;
				subsets[y].rank++;
			}
			
		}

		private static int find(Subset[] subsets, int v1) {
			if(subsets[v1].parent==v1)
				return subsets[v1].parent;
			return find(subsets,subsets[v1].parent);
			
		}
		private static class Edge
		{
			int v1;
			int v2;
			int w;
			public Edge(int a,int b, int c) {
				v1=a;
				v2=b;
				w=c;
			
			}
		}
		private static class Graph
		{
			int N;
			int M;
			Edge edges[];
			Graph(int N1,int M1)
			{
				N=N1;
				M=M1;
				edges=new Edge[M];
			}
			
		}
		private static class Subset
		{
			int parent;
			int rank;
			Subset(int p1,int r1)
			{
				parent=p1;
				rank =r1;
			}
		}
	}


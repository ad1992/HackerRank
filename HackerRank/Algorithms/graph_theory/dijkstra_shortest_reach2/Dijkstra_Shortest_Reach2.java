package graph_theory.dijkstra_shortest_reach2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Dijkstra_Shortest_Reach2 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 String s;
         StringTokenizer st;
         int T=Integer.parseInt(br.readLine().trim());
         while(T-->0)
         {
			 s=br.readLine().trim();    	        
	   	  	 st=new StringTokenizer(s," ");
	         int N=Integer.parseInt(st.nextToken());
	         int M=Integer.parseInt(st.nextToken());
	         @SuppressWarnings("unchecked")
	         LinkedList<Node> adj[]=new LinkedList[N+1];       
	         while(M-->0)
	         {
	        	 	  	s=br.readLine().trim();    	    	         
	        	 	  	st=new StringTokenizer(s);
	       		  	  	int v1=Integer.parseInt(st.nextToken());
	       		  	  	int v2=Integer.parseInt(st.nextToken());
		              	int w=Integer.parseInt(st.nextToken());
		              	if(adj[v1]==null)
		           		{
		           			adj[v1]=new LinkedList<Node>();
		           		}
		           		adj[v1].add(new Node(v2, w));
		           		if(adj[v2]==null)
		           		{
		           			adj[v2]=new LinkedList<Node>();
		           		}
		           		adj[v2].add(new Node(v1, w));
		              
		          
	         }
	         int source=Integer.parseInt(br.readLine());
	         djkstra(adj,source,N);
         }
	}


	private static void djkstra(LinkedList<Node>[] adj, int source, int N) {
		long dist[]=new long[N+1];
		boolean visited[]=new boolean[N+1];
		for(int i=0;i<=N;i++)
		{
			dist[i]=Long.MAX_VALUE;
		}
		dist[source]=0l;
		for(int i=1;i<=N;i++)
		{
			int u=min_dist(dist,visited);
			
			visited[u]=true;
			if(adj[u]!=null)
			{	
				Iterator<Node> itr=adj[u].iterator();
				while(itr.hasNext())
				{
					Node ob=itr.next();
					int v=ob.N;
					int weight=ob.W;
					//System.out.println("edge="+v+"weight="+weight);
					if(!visited[v]&&dist[u]+weight<dist[v])
					{
						dist[v]=dist[u]+weight;
					}
					
				}
			}
		}
		print_Solution(dist,source);
	}

	private static void print_Solution(long[] dist,int s) {
			StringBuilder ans=new StringBuilder();
		   for (int i = 1; i < dist.length; i++)
		   {
			   if(dist[i]==Long.MAX_VALUE)
			   {
				  ans.append("-1 ");
			   }
			   else if(i!=s)
				   ans.append(dist[i]+" ");
			   
		   }
		   System.out.println(ans);
		
	}


	private static int min_dist(long[] dist, boolean[] visited) {
		long min=Integer.MAX_VALUE;
		int min_index=0;
		for(int i=1;i<dist.length;i++)
		{
			if(!visited[i]&&dist[i]<min)
			{
				min=dist[i];
				min_index=i;
			}
		}
		return min_index;
	}


	private static  class Node
	{
		int N;
		int W;
		public Node(int N1,int W1) {
			N=N1;
			W=W1;
		}
	}

}

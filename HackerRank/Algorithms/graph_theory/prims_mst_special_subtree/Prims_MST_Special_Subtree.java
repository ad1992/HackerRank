package graph_theory.prims_mst_special_subtree;


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
public class Prims_MST_Special_Subtree {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
        StringTokenizer st;
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
	           	  adj[v1].add(new Node(v2,w));
	           	  if(adj[v2]==null)
	           	  {
	           	 	adj[v2]=new LinkedList<Node>();
	           	  }
	           	  adj[v2].add(new Node(v1, w));	              
	          
        }
        int source=Integer.parseInt(br.readLine());
        long ans=primMST(adj,N,source);
        System.out.println(ans);

	}
	private static long primMST(LinkedList<Node>[] adj, int N,int source) {	
		long min_weight=0l;
		
		long key[]=new long[N+1];
		boolean visited[]=new boolean[N+1];
		for(int i=1;i<=N;i++)
		{
			key[i]=Long.MAX_VALUE;
		}
		
		key[source]=0l;
		for(int i=1;i<=N;i++)
		{
			int u=min_Key(key,visited);
			visited[u]=true;
			if(adj[u]!=null)
			{
				Iterator<Node> itr=adj[u].iterator();
				while(itr.hasNext())
				{
					Node ob=itr.next();
					int v=ob.N;
					long w=ob.W;
					if(!visited[v]&&key[v]>w)
					{
						key[v]=w;
						
					}
				}
			}
		}
		for(int i=1;i<=N;i++)
		{
			min_weight+=key[i];
		}
		return min_weight;
	}

private static int min_Key(long[] key, boolean[] visited) {
	int min_index=0;
	long min=Long.MAX_VALUE;
	for(int i=1;i<key.length;i++)
	{
		if(!visited[i]&&key[i]<min)
		{
			min=key[i];
			min_index=i;
			
		}
	}
	return min_index;
}
private static class Node
{
	int N;
	int W;
	public Node(int N1,int W1) {
		N=N1;
		W=W1;
	}
}
}


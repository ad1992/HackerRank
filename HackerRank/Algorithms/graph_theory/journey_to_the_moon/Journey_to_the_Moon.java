package graph_theory.journey_to_the_moon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


/**
 * @author Aakansha Doshi
 *
 */
public class Journey_to_the_Moon {
	enum State{
		unvisited,visiting,processed;
	}
	static State state[];
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    String s;
	        StringTokenizer st;
	   
	    	s=br.readLine().trim();
	    	st=new StringTokenizer(s);
	    	int N=Integer.parseInt(st.nextToken());
	    	int M=Integer.parseInt(st.nextToken());
	    	LinkedList<Integer> adj[]=new LinkedList[N];
	    	state=new State[N];
	    	for(int i=0;i<N;i++)
	    		state[i]=State.unvisited;
	    	while(M-->0)
            {
	    		s=br.readLine().trim();    	    	         
          		st=new StringTokenizer(s);
		        int v1=Integer.parseInt(st.nextToken());
		        int v2=Integer.parseInt(st.nextToken());
		        if(adj[v1]==null)
		        {	
		        	adj[v1]=new LinkedList<Integer>();
              	}
              	adj[v1].add(v2);
              	if(adj[v2]==null)
              	{
              		adj[v2]=new LinkedList<Integer>();
              	}
              	adj[v2].add(v1);		              
  	          
            }
	    	long arr[]=new long[N];
            int k=0;
	    	for(int i=0;i<N;i++)
	    	{
	    		if(adj[i]!=null&&state[i]==State.unvisited)
	    		{
	    			long c=Bfs(adj,i);
	    			arr[k]=c;
                    k++;
	    		}
                else if(state[i]==State.unvisited)
                {
                   arr[k]=1;
                    k++;
                }
	    		
	    	}
            long ans=0l;
            for(int i=0;i<k;i++)
            {
                for(int j=i+1;j<k;j++)
                {
                    ans+=arr[i]*arr[j];
                }
            }
	    	System.out.println(ans);
	    
	}
	private static long Bfs(LinkedList<Integer>[] adj, int source) {
		Queue<Integer> queue=new LinkedList<>();
		queue.add(source);
		long count=1l;
		while(!queue.isEmpty())
		{
			int start=queue.poll();
			state[start]=State.visiting;
			if(adj[start]!=null)
			{
				Iterator<Integer> itr=adj[start].iterator();
				while(itr.hasNext())
				{
					int ele=itr.next();
					if(state[ele]==State.unvisited)
					{
						queue.add(ele);
						count++;
						state[ele]=State.visiting;
					}
				
				}
				state[start]=State.processed;
			}
		}
        //System.out.println(count);
		return count;
	}

}

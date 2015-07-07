package graph_theory;
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
public class EvenTree {
	enum State
	{
		unvisited,visiting,processed;
	}
	static State state[];
	static int child[];
	static  LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringTokenizer st;  
        s=br.readLine();
        st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
      child=new int[N+1];
      adj=new LinkedList[N+1];int i=0;
      boolean root[]=new boolean[N+1];
        while(M-->0)
        {
        	 if((s=br.readLine())!=null)
             {
        		 st=new StringTokenizer(s);
                 int v1=Integer.parseInt(st.nextToken());
                 int v2=Integer.parseInt(st.nextToken());
                // child[v2]++;  
                 if(adj[v2]==null)
         		{
         			adj[v2]=new LinkedList<Integer>();
         		}
                 adj[v2].add(v1);
                 root[v1]=true;
             }
        }
        state=new State[N+1];int start=0;
        for(i=1;i<=N;i++)
        {
        	if(!root[i])
        	{
        		start=i;
        		break;
        	}
        }
		for(i=1;i<=N;i++)
		{
			state[i]=State.unvisited;
		}
		Dfs_visit(start);
		int cut=0;
        for(i=2;i<=N;i++)
        {
        	
        		if(child[i]>0&&(child[i]&1)==1)
        		{
        			//System.out.println(i+" "+child[i]);
        			cut++;
        		}
        	
        }
      
       System.out.println(cut);
        		

	}
	private static int Dfs_visit(int i) throws IOException {
		// TODO Auto-generated method stub
		
		if(adj[i]==null||adj[i].peekFirst()==null)
		{
			//System.out.println(i);
			return 0;
		}
		else{
			//System.out.print(i+"-->");
		state[i]=State.visiting;int t=0;
		while(adj[i]!=null&&adj[i].peekFirst()!=null)
		{
			
			 t=adj[i].removeFirst();
			
			if(state[t]==State.unvisited)
			{
				
				
				//System.out.println(i+"-->"+t);
				child[i]+=1+Dfs_visit(t);
				
				//System.out.println(i+"  "+child[i]);
				//child[i]+=child[t];
				
			}
			else
			{
				//System.out.print(t+"-->");	
			}
			state[t]=State.processed;
		}
		return child[i];
 }
	
	
	}
}

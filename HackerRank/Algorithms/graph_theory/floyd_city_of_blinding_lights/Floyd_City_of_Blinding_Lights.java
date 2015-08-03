package graph_theory.floyd_city_of_blinding_lights;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Floyd_City_of_Blinding_Lights {

	public static void main(String[] args) throws IOException {
		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String s;
	        StringTokenizer st;
			s=br.readLine().trim();    	        
	  	  	st=new StringTokenizer(s," ");
	        int N=Integer.parseInt(st.nextToken());
	        int M=Integer.parseInt(st.nextToken());
	        long arr[][]=new long[N+1][N+1];
	        StringBuilder ans=new StringBuilder();
	        
	        for(int i=1;i<=N;i++)
	        {
	        	
	        	for(int j=1;j<=N;j++)
	        	{
	        		arr[i][j]=Long.MAX_VALUE;
	        		
	        	}
	        	arr[i][i]=0;
	        }
	        while(M-->0)
	        {
	        	  s=br.readLine().trim();    	    	         
	        	  st=new StringTokenizer(s);
		          int v1=Integer.parseInt(st.nextToken());
		          int v2=Integer.parseInt(st.nextToken());
		          int w=Integer.parseInt(st.nextToken());
		          arr[v1][v2]=w;
		              
	        }
	        long dist[][]=floydWarshall(arr,N);
	        int Q=Integer.parseInt(br.readLine().trim());
	       
	        while(Q-->0)
	        {
	        	
	        	 s=br.readLine().trim();    	    	         
	   		  	 st=new StringTokenizer(s);
	             int v1=Integer.parseInt(st.nextToken());
	             int v2=Integer.parseInt(st.nextToken());
	             if(dist[v1][v2]==Long.MAX_VALUE)
	            	 dist[v1][v2]=-1;
	             ans.append(dist[v1][v2]+"\n");
	        }
	        System.out.println(ans);
	}

	private static long[][]  floydWarshall(long[][] arr, int N) {
		
		long dist[][]=new long[N+1][N+1];	
		System.arraycopy(arr, 0, dist, 0, arr.length);
		for(int k=1;k<=N;k++)
		{
			for(int i=1;i<=N;i++)
			{
				for(int j=1;j<=N;j++)
				{
					if(dist[i][k]!=Long.MAX_VALUE&&dist[k][j]!=Long.MAX_VALUE&&dist[i][k]+dist[k][j]<dist[i][j])
					{
						dist[i][j]=dist[i][k]+dist[k][j];
					}
				}
			}
		}
		return dist;
		
		
	}

}
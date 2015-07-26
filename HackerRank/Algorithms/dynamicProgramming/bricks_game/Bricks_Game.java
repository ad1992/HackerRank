package dynamicProgramming.bricks_game;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Bricks_Game {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
	      	  int N=Integer.parseInt(br.readLine().trim());
	      	  s=br.readLine().trim();
	      	  st=new StringTokenizer(s);
	      	  int arr[]=new int[N];
	      	  long totalscore[]=new long[N];
	      	  for(int i=0;i<N;i++)
	      	  {
	      		  arr[i]=Integer.parseInt(st.nextToken());
	      		
	      	  }
	      	  totalscore[N-1]=arr[N-1];
	      	  for(int i=N-2;i>=0;i--)
	      	  {
	      		  totalscore[i]=totalscore[i+1]+arr[i];
	      	  }
	      	  long dp[]=new long[N];	
	      	  dp[N-1]=totalscore[N-1];
	      	  dp[N-2]=totalscore[N-2];
	      	  dp[N-3]=totalscore[N-3];
	      	  for(int i=N-4;i>=0;i--)
	      	  {
	      		  dp[i]=totalscore[i]-Math.min(dp[i+1],Math.min(dp[i+2],dp[i+3]));
	      				  
                 // System.out.println(dp[i]);
	      	  }
	      			  
	      	  System.out.println(dp[0]);
	      	  
        }
      	 
      	  

	}

}

package others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ConfusedGorilla {
static long c=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			
			for(int x=0;x<=N/2;x++)
			{
					
				
				System.out.println(x+" "+(N-x));
				if(x*2!=N)
				System.out.println((N-x)+" "+x);
				
			}			
					
		}
		

	}

	

}

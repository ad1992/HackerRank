package fundamentals.summing_the_n_series;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Summing_the_N_series {
private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine().trim())%con;
			long ans=(N*N)%con;
			System.out.println(ans);
			
		}

	}

}

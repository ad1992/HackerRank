package fundamentals.halloween_party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Halloween_party {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			long K=Long.parseLong(br.readLine().trim());
			long l=K/2;
			long b=K-l;
			System.out.println(l*b);
		}

	}

}

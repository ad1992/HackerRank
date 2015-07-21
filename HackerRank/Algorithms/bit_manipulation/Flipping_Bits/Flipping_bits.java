package bit_manipulation.Flipping_Bits;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi 
 */
public class Flipping_bits {
private static long xor=(long)Math.pow(2,32)-1;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			long  num=Long.parseLong(br.readLine().trim());
			System.out.println(num^xor);			
			
		}

	}

}

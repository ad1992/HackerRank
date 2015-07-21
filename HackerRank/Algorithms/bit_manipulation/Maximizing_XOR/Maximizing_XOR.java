package bit_manipulation.Maximizing_XOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 */
public class Maximizing_XOR {

	public static void main(String[] args)throws IOException,NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int L=Integer.parseInt(br.readLine().trim());
		int R=Integer.parseInt(br.readLine().trim());
		int xor=L^R;
		int base2=(int)(Math.log10(xor)/Math.log10(2));
		int ans=(int) (Math.pow(2,base2+1)-1);
		System.out.println(ans);
		

	}

}

package bit_manipulation.Flipping_Bits;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You will be given a list of 32 bits unsigned integers. You are
 *         required to output the list of the unsigned integers you get by
 *         flipping bits in its binary representation (i.e. unset bits must be
 *         set, and set bits must be unset).
 * 
 *         Input Format
 * 
 *         The first line of the input contains the list size T, which is
 *         followed by T lines, each line having an integer from the list.
 * 
 *         Constraints
 * 
 *         1≤T≤100 0≤integer<232
 * 
 *         Output Format
 * 
 *         Output one line per element from the list with the requested result.
 * 
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

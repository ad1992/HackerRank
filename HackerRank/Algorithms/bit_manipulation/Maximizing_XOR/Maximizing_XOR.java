package bit_manipulation.Maximizing_XOR;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Given two integers, L and R, find the maximal value of A xor B, where
 *         A and B satisfy the following condition:
 * 
 *         L≤A≤B≤R
 * 
 *         Input Format
 * 
 *         The input contains two lines; L is present in the first line and R in
 *         the second line.
 * 
 *         Constraints 1≤L≤R≤103
 * 
 *         Output Format
 * 
 *         The maximal value as mentioned in the problem statement.
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

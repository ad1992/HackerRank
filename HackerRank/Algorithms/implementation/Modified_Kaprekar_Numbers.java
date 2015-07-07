package implementation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Problem Statement
 * 
 *         A modified Kaprekar number is a positive whole number n with d
 *         digits, such that when we split its square into two pieces - a right
 *         hand piece r with d digits and a left hand piece l that contains the
 *         remaining d or d−1 digits, the sum of the pieces is equal to the
 *         original number (i.e. l + r = n).
 * 
 *         Alternatively, a modified Kaprekar number is a positive whole number
 *         n with 2d digits (if its number of digits is even) or 2d + 1 digits
 *         (if its number of digits is odd), such that when we split its square
 *         into two pieces, a right hand piece r containing d or d + 1 digits,
 *         and a left piece l containing the remaining d digits, the sum of the
 *         two pieces is equal to the original number.
 * 
 *         Note: r may have leading zeros.
 * 
 *         Here's an alternative explanation from Wikipedia: In mathematics, a
 *         Kaprekar number for a given base is a non-negative integer, the
 *         representation of whose square in that base can be split into two
 *         parts that add up to the original number again. For instance, 45 is a
 *         Kaprekar number, because 45² = 2025 and 20+25 = 45.
 * 
 *         The Task You are given the two positive integers p and q, where p is
 *         lower than q. Write a program to determine how many Kaprekar numbers
 *         are there in the range between p and q (both inclusive) and display
 *         them all.
 * 
 *         Input Format
 * 
 *         There will be two lines of input: p, lowest value q, highest value
 * 
 *         Constraints: 0<p<q<100000
 * 
 *         Output Format
 * 
 *         Output each Kaprekar number in the given range, space-separated on a
 *         single line. If no Kaprekar numbers exist in the given range, print
 *         INVALID RANGE.
 */
public class Modified_Kaprekar_Numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long p=Long.parseLong(br.readLine().trim());
		long q=Long.parseLong(br.readLine().trim());
        boolean flag=true;
		for(long i=p;i<=q;i++)
		{
			long sqr=i*i;
			int len=String.valueOf(i).length();
			long left=(long) (sqr/Math.pow(10,len));
			long right=(long) (sqr%Math.pow(10,len));
           // System.out.println(left+" "+right+" "+sqr);
			if(left+right==i)
			{
				flag=false;
                System.out.print(i+" ");
			}
		}
		if(flag)
            System.out.println("INVALID RANGE");
		
	}

}

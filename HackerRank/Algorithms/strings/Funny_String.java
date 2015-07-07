package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Suppose you have a string S which has length N and is indexed from 0
 *         to N−1. String R is the reverse of the string S. The string S is
 *         funny if the condition |Si−Si−1|=|Ri−Ri−1| is true for every i from 1
 *         to N−1.
 * 
 *         (Note: Given a string str, stri denotes the ascii value of the ith
 *         character (0-indexed) of str. |x| denotes the absolute value of an
 *         integer x)
 * 
 *         Input Format
 * 
 *         First line of the input will contain an integer T. T testcases
 *         follow. Each of the next T lines contains one string S.
 * 
 */
public class Funny_String {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int start=0;
				int end=s.length()-1;
				if(check(s,start,end))
				{
					out.println("Funny");
				}
				else
				{
					out.println("Not Funny");
				}
                T--;
			}
		}
        out.close();
		
	

	}

	private static boolean check(String s, int start, int end) {
		// TODO Auto-generated method stub
		while(start<=end)
		{
			int diff1=Math.abs(s.charAt(start)-s.charAt(start+1));
			int diff2=Math.abs(s.charAt(end)-s.charAt(end-1));
			if(diff1!=diff2){
               // System.out.println(diff1+" "+diff2);
				return false;
            }
            start++;
            end--;
		}
		return true;
	}

}

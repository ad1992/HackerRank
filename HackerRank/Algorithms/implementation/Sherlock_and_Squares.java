package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Watson gives two integers (A and B) to Sherlock and asks if he can
 *         count the number of square integers between A and B (both inclusive).
 * 
 *         Note: A square integer is an integer which is the square of any
 *         integer. For example, 1, 4, 9, and 16 are some of the square integers
 *         as they are squares of 1, 2, 3, and 4, respectively.
 * 
 *         Input Format The first line contains T, the number of test cases. T
 *         test cases follow, each in a new line. Each test case contains two
 *         space-separated integers denoting A and B.
 * 
 *         Output Format For each test case, print the required answer in a new
 *         line.
 * 
 */
public class Sherlock_and_Squares {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
        while(T>0)
        {
        	if((s=br.readLine().trim())!=null)
			{
        		st=new StringTokenizer(s);
        		long A=Long.parseLong(st.nextToken());
        		long B=Long.parseLong(st.nextToken());
        		long sqrtA=(long) Math.ceil(Math.sqrt(A));
        		long sqrtB=(long) Math.ceil(Math.sqrt(B));
        		int count=0;
        		for(long i=sqrtA;i<=sqrtB;i++)
        		{
        			if(i*i<=B)
        			{
        				count++;
        			}
        			else
        			{
        				break;
        			}
        		}
        		out.println(count);
        		T--;
			}
        }
        out.close();
        

	}

}

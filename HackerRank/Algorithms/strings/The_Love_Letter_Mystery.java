package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Problem Statement
 * 
 *         James found a love letter his friend Harry has written for his
 *         girlfriend. James is a prankster, so he decides to meddle with the
 *         letter. He changes all the words in the letter into palindromes.
 * 
 *         To do this, he follows two rules:
 * 
 *         He can reduce the value of a letter, e.g. he can change d to c, but
 *         he cannot change c to d. In order to form a palindrome, if he has to
 *         repeatedly reduce the value of a letter, he can do it until the
 *         letter becomes a. Once a letter has been changed to a, it can no
 *         longer be changed.
 * 
 *         Each reduction in the value of any letter is counted as a single
 *         operation. Find the minimum number of operations required to convert
 *         a given string into a palindrome.
 * 
 *         Input Format
 * 
 *         The first line contains an integer T, i.e., the number of test cases.
 *         The next T lines will contain a string each. The strings do not
 *         contain any spaces.
 * 
 *         Constraints 1≤T≤10 1≤ length of string ≤10^4 All characters are lower
 *         case English letters.
 * 
 *         Output Format
 * 
 *         A single line containing the number of minimum operations
 *         corresponding to each test case.
 */
public class The_Love_Letter_Mystery {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s1;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s1=br.readLine().trim())!=null)
			{
				int len=s1.length();
                int start=0,end=len-1;int pos=-1;
                char arr[]=s1.toCharArray();
				int ans=checkpal(arr);
				out.println(ans);
				T--;	
			}
		}
		out.close();

	}
	private static int checkpal(char arr[]) {
		// TODO Auto-generated method stub
		int i=0,j=arr.length-1;
		int change=0;
		while(i<=j)
		{
			if(arr[i]!=arr[j])
			{
				change+=Math.abs(arr[i]-arr[j]);
			}
				
			i++;
			j--;
		}
		return change;
		
	}

}

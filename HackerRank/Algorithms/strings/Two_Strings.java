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
 *         You are given two strings, A and B. Find if there is a substring that
 *         appears in both A and B.
 * 
 *         Input Format
 * 
 *         Several test cases will be given to you in a single file. The first
 *         line of the input will contain a single integer T, the number of test
 *         cases.
 * 
 *         Then there will be T descriptions of the test cases. Each description
 *         contains two lines. The first line contains the string A and the
 *         second line contains the string B.
 * 
 *         Output Format
 * 
 *         For each test case, display YES (in a newline), if there is a common
 *         substring. Otherwise, display NO.
 * 
 *        
 */
public class Two_Strings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s1, s2;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s1=br.readLine().trim())!=null)
			{
				if((s2=br.readLine().trim())!=null)
				{
					if(commonSubstring(s1,s2))
					{
						out.println("YES");
					}
					else
					{
						out.println("NO");
					}
				}
				T--;
			}
		}
        out.close();
	
	}

	private static boolean commonSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		boolean first[]=new boolean[26];
		for(int i=0;i<s1.length();i++)
		{
			first[s1.charAt(i)-97]=true;
		}
		for(int i=0;i<s2.length();i++)
		{
			if(first[s2.charAt(i)-97])
			{
				return true;
			}
				
		}
		return false;
	}

	
}

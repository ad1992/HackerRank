package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Shashank likes strings in which consecutive characters are different.
 *         For example, he likes ABABA, while he doesn't like ABAA. Given a
 *         string containing characters A and B only, he wants to change it into
 *         a string he likes. To do this, he is allowed to delete the characters
 *         in the string.
 * 
 *         Your task is to find the minimum number of required deletions.
 * 
 *         Input Format
 * 
 *         The first line contains an integer T, i.e. the number of test cases.
 *         The next T lines contain a string each.
 * 
 *         Output Format
 * 
 *         For each test case, print the minimum number of deletions required.
 * 
 */
public class Alternating_Characters {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		String s;
		
		
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int count=0;
				for(int i=0;i<s.length()-1;i++)
				{
					int ch=s.charAt(i);
					int ch1=s.charAt(i+1);
					if((ch^ch1)==0)//using the concept  number xored with itself is always 0
					{
						count++;
					}
					
				}
				System.out.println(count);
                T--;
			}
			
		}

	}

}

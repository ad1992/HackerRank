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
 *         John has discovered various rocks. Each rock is composed of various
 *         elements, and each element is represented by a lower-case Latin
 *         letter from 'a' to 'z'. An element can be present multiple times in a
 *         rock. An element is called a gem-element if it occurs at least once
 *         in each of the rocks.
 * 
 *         Given the list of N rocks with their compositions, display the number
 *         of gem-elements that exist in those rocks.
 * 
 *         Input Format
 * 
 *         The first line consists of an integer, N, the number of rocks. Each
 *         of the next N lines contains a rock's composition. Each composition
 *         consists of lower-case letters of English alphabet.
 * 
 *         Constraints 1≤N≤100 Each composition consists of only lower-case
 *         Latin letters ('a'-'z'). 1≤ length of each composition ≤100
 * 
 *         Output Format
 * 
 *         Print the number of gem-elements that are common in these rocks. If
 *         there are none, print 0.
 * 
 * 
 * 
 */
public class Gemstones {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		int T=Integer.parseInt(br.readLine().trim());
		int count[][]=new int[T][26];
		int N=T;
        int i=0;
		while(T>0)
		{
			
			if((s=br.readLine().trim())!=null)
			{
				for(int j=0;j<s.length();j++)
				{
					count[i][s.charAt(j)-97]++;
				}
				T--;
                i++;
			}
		}
		/*for(i=0;i<N;i++)
		{
			for(int j=0;j<26;j++)
			{
				System.out.print(count[i][j]+" ");
			}
			System.out.println();
		}*/
		int c=0;
		for(int col=0;col<26;col++)
		{
			boolean check=true;
			for(int row=0;row<N;row++)
            {
                if(count[row][col]==0)
                {
                	check=false;
                    break;
                	
                }
               
                    
            }
			if(check)
			{
				c++;
			}
		}
		out.println(c);
		out.close();
	}

}

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
 *         Dothraki are planning an attack to usurp King Robert's throne. King
 *         Robert learns of this conspiracy from Raven and plans to lock the
 *         single door through which the enemy can enter his kingdom.
 * 
 *         But, to lock the door he needs a key that is an anagram of a certain
 *         palindrome string.
 * 
 *         The king has a string composed of lowercase English letters. Help him
 *         figure out whether any anagram of the string can be a palindrome or
 *         not.
 * 
 *         Input Format A single line which contains the input string.
 * 
 *         Constraints 1≤ length of string ≤105 Each character of the string is
 *         a lowercase English letter.
 * 
 *         Output Format A single line which contains YES or NO in uppercase.
 * 
 */
public class Game_of_Thrones_I {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		s=br.readLine().trim();
		int count[]=new int[26];
		for(int i=0;i<s.length();i++)
		{
			int ch=s.charAt(i)-97;
			count[ch]++;
		}
		int check=0;
            
		for(int i=0;i<26;i++)
		{
			if((count[i]&1)==1)
			{
				check++;
			}
				
		}
		if(check<=1)
		{
			out.println("YES");
		}
        
		else
		{
			out.println("NO");
		}
				
	
		out.close();

	}

}

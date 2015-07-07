package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Given a string, find number of words in that string. For this problem
 *         a word is defined by a string of one or more english alphabets.
 * 
 *         There are multiple ways to tokenize a string in java, learn how to
 *         tokenize a string in java and demonstrate your skill by solving this
 *         problem!
 * 
 *         Input Format A string not more than 400000 characters long. The
 *         string can be defined by following regular expression:
 * 
 *         [A-Za-z !,?.\_'@]+
 * 
 *         That means the string will only contain english alphabets, blank
 *         spaces and this characters: "!,?._'@".
 * 
 *         Output Format In the first line, print number of words n in the
 *         string. The words don't need to be unique. In the next n lines, print
 *         all the words you found in the order they appeared in the input.
 * 
 */
public class java_String_token {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim();
		String pattern = "[A-Z|a-z|]+";
		Pattern r = Pattern.compile(pattern);
		// Now create matcher object.
		Matcher m = r.matcher(s);		
		int i=0;
		StringBuilder ans=new StringBuilder();
		while(m.find())
		{	
			i++;
			ans.append(m.group()+"\n");
		}
		System.out.println(i);
		System.out.println(ans);

	}
}

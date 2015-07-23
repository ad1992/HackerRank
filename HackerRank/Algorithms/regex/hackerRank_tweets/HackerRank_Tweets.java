package regex.hackerRank_tweets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class HackerRank_Tweets {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());
		int c=0;
		while(T-->0)
		{
			String s=br.readLine().trim();
			if(count_hackerrank(s))
			{
				c++;
			}
		}
		System.out.println(c);
	}

	private static boolean count_hackerrank(String s) {
		// TODO Auto-generated method stub
		String pat="hackerrank";
		Pattern r = Pattern.compile(pat,Pattern.CASE_INSENSITIVE);
        Matcher m = r.matcher(s);
        return m.find();
	}

	
}

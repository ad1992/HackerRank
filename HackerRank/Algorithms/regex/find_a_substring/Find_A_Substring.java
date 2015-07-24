package regex.find_a_substring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Find_A_Substring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int N=Integer.parseInt(br.readLine().trim());
		String s="";
		
		for(int i=0;i<N;i++)
		{
			s+=br.readLine().trim()+" ";
			
		}
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			String word=br.readLine().trim();
			int ans=check_Substring(s,word);
			System.out.println(ans);
		}
	}

	private static int check_Substring(String s, String word) {
		// TODO Auto-generated method stub
		String pat="([a-z]|[A-Z]|[0-9]|_)+"+word+"([a-z]|[A-Z]|[0-9]|_)+";
		Pattern p=Pattern.compile(pat);		
		Matcher m=p.matcher(s);
		int c=0;
		while(m.find())
		{
			c++;
		}
		return c;
	}

}

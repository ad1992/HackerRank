package regex.the_british_and_american_style_of_spelling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class The_British_and_American_Style_of_Spelling {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int N=Integer.parseInt(br.readLine().trim());
		String s="";
		
		for(int i=0;i<N;i++)
		{
			s+=br.readLine().trim();
			
		}
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			String word=br.readLine().trim();
			int ans=check_frequency(word,s);
			System.out.println(ans);
		}
	}

	private static int check_frequency(String w1, String s) {
		String w2=w1.replace("ze", "se");
		///System.out.println(w2);
		String pat=w1+"|"+w2;
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

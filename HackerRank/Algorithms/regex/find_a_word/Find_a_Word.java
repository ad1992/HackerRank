package regex.find_a_word;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_a_Word {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
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
			int ans=count_Word(s,word);
            System.out.println(ans);
		}
	}

	private static int count_Word(String s, String word) {
		String pat="\\b"+word+"\\b";	
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

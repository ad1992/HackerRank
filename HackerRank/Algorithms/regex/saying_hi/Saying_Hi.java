package regex.saying_hi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Saying_Hi {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			String s=br.readLine().trim();
			check_Hi(s);
			
		}

	}

	private static void check_Hi(String s) {
		// TODO Auto-generated method stub
		String pat="^(h|H)(i|I)\\s[^d|D]";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		if(m.find())
			System.out.println(s);
	}

}

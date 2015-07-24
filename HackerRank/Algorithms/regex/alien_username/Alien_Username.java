package regex.alien_username;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Alien_Username {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());		
		while(T-->0)
		{
			String s=br.readLine().trim();
			if(is_Valid_Username(s))
			{
				System.out.println("VALID");
			}
			else
			{
				System.out.println("INVALID");
			}
			
	}

}

	private static boolean is_Valid_Username(String s) {
		// TODO Auto-generated method stub
        String pat="^(_|\\.)\\d+[a-z A-Z]*_?$";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);
		return m.find();
	}

}	
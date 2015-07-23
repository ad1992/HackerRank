package regex.utopian_identification_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Utopian_Identification_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());		
		while(T-->0)
		{
			String s=br.readLine().trim();
			if(is_Valid_Utopian(s))
				System.out.println("VALID");
			else
				System.out.println("INVALID");
		}
	}

	private static boolean is_Valid_Utopian(String s) {
		// TODO Auto-generated method stub
		String pat="^[a-z]{0,3}\\d{2,8}[A-Z]{3,}$";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(s);		
		return 	m.find();
	}

}

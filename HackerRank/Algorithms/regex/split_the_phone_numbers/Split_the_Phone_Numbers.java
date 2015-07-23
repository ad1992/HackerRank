package regex.split_the_phone_numbers;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Split_the_Phone_Numbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());		
		while(T-->0)
		{
			String s=br.readLine().trim();
			String pat="^([0-9]{1,3})[-|\\s]([0-9]{1,3})[-|\\s]([0-9]{4,10})$";
			Pattern p=Pattern.compile(pat);
			Matcher m=p.matcher(s);			
			if(m.find())
				System.out.println("CountryCode="+m.group(1)+",LocalAreaCode="+m.group(2)+",Number="+m.group(3));
		
			
			
			
		}
	}

}

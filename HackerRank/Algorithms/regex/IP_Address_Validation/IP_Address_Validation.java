package regex.IP_Address_Validation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class IP_Address_Validation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());		
		while(T-->0)
		{
			String s=br.readLine().trim();
		    System.out.println(check_IP(s));
		}

	}

	private static String check_IP(String s) {
        String ipv4="^(([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
		String ipv6="^([0-9 a-f]{1,4}:){7}[0-9 a-f]{1,4}$";
		Pattern p1=Pattern.compile(ipv4);
		Pattern p2=Pattern.compile(ipv6);
		Matcher m1=p1.matcher(s);		
		Matcher m2=p2.matcher(s);
		if(m1.find())
		{
			return "IPv4";
		}
		if(m2.find())
		{
			return "IPv6";
		}
		return "Neither"; 
		
		
	}

}

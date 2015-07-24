package regex.detect_the_email_addresses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Detect_the_Email_Addresses {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int N=Integer.parseInt(br.readLine().trim());
		String s="";
		
		for(int i=0;i<N;i++)
		{
			s+=br.readLine().trim()+" ";
			
		}
		TreeSet<String> tree=valid_Emails(s);
		int i=0;
	    String s1="";
		for(String t:tree)
		{
			s1=t;
		    if(i==tree.size()-1)
		    break;
			System.out.print(t+";");
		    i++;
	    }
	    System.out.print(s1);
		
	}

	private static TreeSet<String> valid_Emails(String s) {
		// TODO Auto-generated method stub
		String pat="([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.([a-zA-Z0-9-]){2,3})";
		Pattern p=Pattern.compile(pat);		
		Matcher m=p.matcher(s);	
		TreeSet<String> set=new TreeSet<>();
		while(m.find())
		{
			set.add(m.group(1));
		}
		return set;
		
	}

}

package regex.find_hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Aakansha Doshi
 *
 */
public class Find_HackerRank {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());		
		while(T-->0)
		{
			String s=br.readLine().trim();
			System.out.println(checkhackerrank(s));
		}

	}

	private static int checkhackerrank(String s) {
		// TODO Auto-generated method stub
		String start="^hackerrank";
		String end="hackerrank$";
		Pattern p1=Pattern.compile(start);
		Pattern p2=Pattern.compile(end);
		Matcher m1=p1.matcher(s);
		Matcher m2=p2.matcher(s);
		boolean starter=m1.find();
		boolean ender=m2.find();
		if(starter&&ender)
		{
			return 0;
		}
		if(ender)
		{
			return 2;
		}
		if(starter)
		{	
			return 1;
		}
		return -1;
	}

}

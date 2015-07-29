package fundamentals.possible_path;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Possible_Path {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			String s=br.readLine().trim();
			String arr[]=s.split("\\s");
			long a=Long.parseLong(arr[0]);
			long b=Long.parseLong(arr[1]);
			long x=Long.parseLong(arr[2]);
			long y=Long.parseLong(arr[3]);
		
			if((gcd(x,y)==gcd(a,b)))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}

	}

	private static Object gcd(long a, long b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

}

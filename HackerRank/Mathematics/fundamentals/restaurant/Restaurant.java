package fundamentals.restaurant;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Restaurant {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			String s=br.readLine().trim();
			StringTokenizer st=new StringTokenizer(s);
			int l=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int gcd=gcd(l,b);
			int ans=(l*b)/(gcd*gcd);
            System.out.println(ans);
		}

	}

	private static int gcd(int a, int b) {
		if(b==0)
			return 	a;
		return gcd(b,a%b);
	}

}

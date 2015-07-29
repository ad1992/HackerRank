package fundamentals.die_hard_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Die_Hard_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			String s=br.readLine().trim();
			String arr[]=s.split("\\s");
			int a=Integer.parseInt(arr[0]);
			int b=Integer.parseInt(arr[1]);
			int c=Integer.parseInt(arr[2]);
			int gcd=gcd(a,b);
			if(c%gcd==0&&c<=Math.max(a,b))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}

	}

	private static int gcd(int a, int b) {
	if(b==0)
		return a;
	return gcd(b,a%b);
	}

}

package number_theory;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Problem Statement
 * 
 *         Your friend gives you an equation A≡X2(modM) and asks you to find an
 *         integer solution for X.
 * 
 *         However, you know your friend's mischievous nature and suspect that
 *         there is no solution to such an equation. Thus, you first want to
 *         find out whether there is a solution to it.
 * 
 *         You may find this link helpful:
 *         http://en.wikipedia.org/wiki/Euler%27s_criterion
 * 
 *         Input Format
 * 
 *         The first line contains the number of cases, T. T lines follow, each
 *         containing two integers A and M separated by a single space.
 * 
 *         Output Format
 * 
 *         Output T lines, each containing one word: YES, if a solution exists
 *         and NO otherwise.
 */
public class Eulers_Criterion {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
        
		
		while(T>0)
		{
			StringBuilder ans=new StringBuilder();
            if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long A=Long.parseLong(st.nextToken());
				long M=Long.parseLong(st.nextToken());
				long p=pow(A,(M-1)/2,M);
				if(p==1||A==0)
				{
					ans.append("YES\n");
				}
				else
				{
					ans.append("NO\n");
				}
                System.out.print(ans);
                T--;
			}
		}

	}

	private static long pow(long b, long m,long con) {
		// TODO Auto-generated method stub
		long a=1l;
		while(m>0)
		{
			if((m&1)==1)
				a=(a*b)%con;
			b=(b*b)%con;
			m>>=1;
		}
		return a;
	}

}

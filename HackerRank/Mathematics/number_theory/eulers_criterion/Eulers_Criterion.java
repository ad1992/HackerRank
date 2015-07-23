package number_theory.eulers_criterion;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
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

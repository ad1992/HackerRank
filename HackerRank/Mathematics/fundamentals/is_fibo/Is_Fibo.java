package fundamentals.is_fibo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Aakansha Doshi
 *
 */
public class Is_Fibo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		Set<Long> set=new HashSet<>();
		set.add(0l);
		set.add(1l);
		long a=0l,b=1l;
		long c=1;
		while(c<=10000000000l)
		{
			c=a+b;
			set.add(c);
			a=b;
			b=c;
		}
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine().trim());
			if(set.contains(N))
			{
				System.out.println("IsFibo");
			}
			else
			{
				System.out.println("IsNotFibo");
			}
		}

	
	}

}

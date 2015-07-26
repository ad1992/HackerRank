package fundamentals.sherlock_and_divisors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Sherlock_and_Divisors {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine().trim());
			int ans=get_EverDivisor_Count(N);
            System.out.println(ans);
		}

	}

	private static int get_EverDivisor_Count(long N) {
       
		long sqrt=(long)Math.sqrt(N);
		long i=2;		
        int c=0;
        if(N==2)
            return 1;
        if((N&1)==0)
          c++;   
        else
            return 0;
        
		while(i<=sqrt)
		{
			if(N%i==0)
			{
				if((i&1)==0)
                   c++;              
                long a=N/i;
                if(i*i!=N&&(a&1)==0)	
                   c++;   				
				//System.out.println(c+" "+i);           
              
					
			}
			i++;
		}
		return c;
	}

}

package fundamentals.diwali_lights;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Diwali_Lights {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine());
            long ans=1;
            while(N-->0)
            {
                ans=(ans*2)%100000;
            }
            System.out.println(ans-1);
        }

	}

}

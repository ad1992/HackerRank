package fundamentals.filling_jars;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Filling_Jars {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String s;
		StringTokenizer st;
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		long N=Long.parseLong(st.nextToken()); 
		long M=Long.parseLong(st.nextToken());
		long sum=0l;
		while(M-->0)
		{
			s=br.readLine().trim();
			st=new StringTokenizer(s);
			long a=Long.parseLong(st.nextToken()); 
			long b=Long.parseLong(st.nextToken());
			long k=Long.parseLong(st.nextToken());
			sum+=((b-a)+1)*k;
			
			
		}
		long ans=(long) Math.floor(sum/N);
		System.out.println(ans);
				

	}

}

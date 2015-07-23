package number_theory.closest_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi 
 *       
 * 
 */
public class Closest_Number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T>0)
		{
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long a=Long.parseLong(st.nextToken());
				long b=Long.parseLong(st.nextToken());
				long x=Long.parseLong(st.nextToken());
				long pow=(long) Math.pow(a, b);
				long close=pow/x;
				long left=close*x;
				long right=(close+1)*x;
				long diff1=Math.abs(left-pow);
				long diff2=Math.abs(right-pow);
				if(diff1<=diff2)
					System.out.println(left);
				else
					System.out.println(right);
				
				T--;
				
			}
		}

	}

}

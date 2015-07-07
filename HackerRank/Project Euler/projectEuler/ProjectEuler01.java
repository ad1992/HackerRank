package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler01 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim())-1;
			long s1=N/3;
			long s2=N/5;
			long s3=N/15;
			s1=3*s1*(s1+1)/2;
			s2=5*s2*(s2+1)/2;
			s3=15*s3*(s3+1)/2;
			long sum=s1+s2-s3;
			System.out.println(sum);
		}
	}
}

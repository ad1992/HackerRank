package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler07 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());		
		long arr[]=new long[10001];
		arr[1]=2;arr[2]=3;arr[3]=5;arr[4]=7;arr[5]=11;arr[6]=13;
		int i=7;long num=17;
		while(i<=10000)
		{
			if(checkPrime(num))
			{
				arr[i]=num;
				i++;
				num++;
			}
			else
			{
				num++;
			}
		}
	//	String s;
		while(T-->0)
		{
			int n=Integer.parseInt(br.readLine().trim());	
			System.out.println(arr[n]);
		}
	}

	private static boolean checkPrime(long num) {
		// TODO Auto-generated method stub
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}

}

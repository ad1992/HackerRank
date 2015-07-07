package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;

public class ProjectEuler22 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
				int N=Integer.parseInt(br.readLine().trim());
				String arr[]=new String[N];
				for(int i=0;i<N;i++)
				{
					arr[i]=br.readLine().trim();
				}
				Arrays.sort(arr);
				Hashtable<String, Integer> hash=new Hashtable<>();
				for(int i=0;i<N;i++)
				{
					int sum=0;
					for(int j=0;j<arr[i].length();j++)
					{
						long ch=arr[i].charAt(j)-64;
						//System.out.println(ch+" "+(char)(ch+64));
						sum+=ch;
						
					}
					sum*=(i+1);
					hash.put(arr[i], sum);
					//ans+=sum;
					//System.out.println(arr[i]+" "+sum);
				
				}
				int Q=Integer.parseInt(br.readLine().trim());
				while(Q-->0)
				{
					String s1=br.readLine();
					System.out.println(hash.get(s1));
				}
				
	}

}

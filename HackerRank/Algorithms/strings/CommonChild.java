package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommonChild {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1,s2;
		s1=br.readLine();
		s2=br.readLine();
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		int lcs[][]=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<=s1.length();i++)
		{
			for(int j=0;j<=s2.length();j++)
			{
				if(i==0||j==0)
					lcs[i][j]=0;
				else if(arr1[i-1]==arr2[j-1])
				{
					lcs[i][j]=lcs[i-1][j-1]+1;
				}
				else
				{
					lcs[i][j]=Math.max(lcs[i-1][j], lcs[i][j-1]);
				}
			}
		}
		System.out.println(lcs[s1.length()][s2.length()]);
		
	}

}

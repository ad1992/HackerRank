package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler63 {
	/**
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
	int N=Integer.parseInt(br.readLine().trim());
	long ans=1l;
	if(N==1)
		System.out.println(ans);
	else
	{
		for(int i=2;i<=9;i++)
		{
			ans=(long)i;
			//System.out.println(i);
			for(int j=1;j<N;j++)
			{
				ans=ans*i;
			}
			String len=String.valueOf(ans);
			if(len.length()==N)
				System.out.println(ans);
		}
	}
	

}
}

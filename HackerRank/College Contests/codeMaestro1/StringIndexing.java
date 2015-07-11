package codeMaestro1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class StringIndexing {
	private static final long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine());
		String s1,s2;
		s1=br.readLine();
		s2=br.readLine();
		long arr[]=new long[N];
		
		for(int i=N-1;i>=0;i--)
		{
			int diff;
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch2>=ch1)
			{
				 diff=ch2-ch1;
				
			}
			else
			{
				 diff='z'-ch1+ch2-96;
				
			}
			//diff++;
			if(i==N-1)
			{
				arr[i]=diff+1;
			}
			else
			{
				if(diff>0){
				if(arr[i+1]==0)
				{
					arr[i]='z'-s1.charAt(i+1)+s2.charAt(i+1)-96;
				}
				arr[i]=(((diff-1)*26)%con+arr[i+1]%con)%con;
				}
				else
					arr[i]=arr[i+1]%con;
			}
		}
		/*for(int i=N-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}*/
		System.out.print("\n"+arr[0]);

	}

}

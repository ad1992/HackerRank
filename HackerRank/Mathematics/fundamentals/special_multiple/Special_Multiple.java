package fundamentals.special_multiple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class Special_Multiple {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		long mult[]=new long[100001];
		for(int i=1;i<mult.length;i++)
		{
			long bin=Long.parseLong(Long.toBinaryString(i));
			mult[i]=bin*9l;
			
		}
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine());
			for(int i=1;i<mult.length;i++)
			{
				if(mult[i]%num==0)
				{
					System.out.println(mult[i]);
					break;
				}
			}
		}

	}

	
}

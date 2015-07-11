package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			long num=Long.parseLong(br.readLine().trim());			
			long i=2;
			while(i<=Math.sqrt(num))
			{
				if(num%i==0)
				{
					while(num%i==0)
					{
						num/=i;
					}			
					if(num==1)
                    {
                        num=i;
                        break;
                    }
				}
				else
				{
					i++;
				}
			}
			System.out.println(num);
		
		}
	}
	

}

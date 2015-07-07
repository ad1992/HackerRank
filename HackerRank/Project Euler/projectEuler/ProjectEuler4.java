package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler4 {

	
		public static void main(String[] args) throws NumberFormatException, IOException {
			// TODO Auto-generated method stub
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			int T=Integer.parseInt(br.readLine().trim());
			
		//	String s;
			while(T-->0)
			{
				int N=Integer.parseInt(br.readLine().trim())-1;
				int max=Integer.MIN_VALUE;
			
				for(int i=1000;i>=100;i--)
				{
					for(int j=i;j>=100;j--)
					{
						int p=i*j;
						if(checkPal(p))
						{
						
							if(p>max&&p<N)
								max=p;
						}
					}
				}
				System.out.println(max);
			}
			
		
	}

		private static boolean checkPal(int p) {
			// TODO Auto-generated method stub
			int num=p;
			int r;
			int s=0;
			while(num>0)
			{
				s=s*10+num%10;
				num/=10;
			}
			if(s==p)
				return true;
			return false;
		}

}

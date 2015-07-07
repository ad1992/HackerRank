package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler26 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());int number=0;
			int len=0;
			for(int i=N-1;i>=2;i--)
			{
			
				int rem[]=new int [i];
				int n=1;
				int pos=0;
				while(rem[n]==0&&n>0)
				{
					rem[n]=pos;
					n=n*10;
					n%=i;
					pos++;
				}
                //System.out.println(i+" "+n);
				if(pos-rem[n]>=len&&n>0)
				{
					len=pos-rem[n];
					number=i;
				}
                	
				if(len>=i){		
				
					break;
				}
			
			}
		System.out.println(number);
		}
	}
}


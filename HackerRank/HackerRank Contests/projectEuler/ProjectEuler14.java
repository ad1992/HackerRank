package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		int maxval=5000001;
		
		long val[]=new long[maxval];
		for(int i=2;i<=5000000;i++)
		{
			long temp=i;
			Stack<Long> st=new Stack<Long>();
			while(temp>1&&(temp>maxval||val[(int) temp]==0))
			{
				st.push(temp);
				temp=((temp&1)==1)?temp*3+1:temp/2;
			}
			int steps=(int) (val[(int) temp]+1);
			while(!st.isEmpty())
			{
				steps++;
				long top=st.peek();
				st.pop();
				if(top<maxval)
					val[(int) top]=steps;				
				
			}
		}
			long cal[]=new long[maxval];
			for(int i=1;i<maxval;i++)
			{
				long v=val[i];
				if(v>=val[(int) cal[i-1]])
				{
					cal[i]=i;
				}
				else
					cal[i]=cal[i-1];
			}
         
			
		
			
           // System.out.println(num+" "+arr[19]+" "+arr[18]);
		
		while(T-->0)
		{
			int  N=Integer.parseInt(br.readLine().trim());
			
			System.out.println(cal[N]);
		}
		
	}

}

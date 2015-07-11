package projectEuler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler78 {
	private static long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long arr[]=new long[1000001];
		arr[0]=1l;		
		
		int sign=1;
		for(int cur=1;cur<=60000;cur++)
		{
			int m=0,p=1;			
			while(p<=cur)
			{
				if((m%4)>1)
					sign=-1;
				else
					sign=1;
				arr[cur]=(arr[cur]+(sign*arr[cur-p])+con)%con;
				m++;
				int k=((m&1)==0)?m/2+1:-(m/2+1);
				p=k*(3*k-1)/2;
				
			}
        }
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			int T=Integer.parseInt(br.readLine());
			while(T-->0)
			{
				int num=Integer.parseInt(br.readLine().trim());
				System.out.println(arr[num]);
			}

		}
	
		
	}





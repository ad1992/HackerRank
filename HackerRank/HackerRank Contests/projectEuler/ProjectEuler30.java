package projectEuler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[]=new int[7];
		arr[3]=2916;
		arr[4]=32805;
		arr[5]=354294;
		arr[6]=3720087;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int N=Integer.parseInt(br.readLine().trim());long nsum=0l;
		for(int i=10;i<=arr[N];i++)
		{
			int num=i;int sum=0;
			while(num>0)
			{
				int r=num%10;int pow=r;
				for(int j=1;j<N;j++)
				{
					pow*=r;
				}
				sum+=pow;
				num/=10;
			}
			if(i==sum)
			{
				nsum+=i;
			}
		}
		System.out.println(nsum);
	}

}

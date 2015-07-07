package projectEuler;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i,j,k;i=j=k=0;int I,J,K;
		
		int arrI[]=new int[3001];
		int arrJ[]=new int[3001];
		int arrK[]=new int[3001];
		for(int N=1;N<=3000;N++)
		{
		I=J=K=-1;
			for( i=1;i<N/3;i++)
			{
				for(j=i;j<N/2;j++)
				{
					k=N-i-j;
					if(((i*i)+(j*j))==(k*k))
					{
						I=i;
						J=j;
						K=k;
					
					}
			
				}
			}
			arrI[N]=I;
			arrJ[N]=J;
			arrK[N]=K;
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
	//	String s;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			System.out.println(arrI[N]*arrJ[N]*arrK[N]);
			
			
		
			}
		
		

	}
}


package number_theory.fibonacci_finding_easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 */
public class Fibonacci_Finding_Easy {
private static long con=1000000007;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
        
		
		while(T>0)
		{
			
            if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long A=Long.parseLong(st.nextToken());
				long B=Long.parseLong(st.nextToken());
				long N=Long.parseLong(st.nextToken());
				long C=(A+B)%con;
				long fibo1[][]={{C,B},{B,A}};
				long fibo2[][]={{1,1},{1,0}};
				
				if(N==0)
				{
					System.out.println(A);
				}
				else if(N==1)
				{
					System.out.println(B);
				}
				else if(N==2)
				{
					System.out.println(C);
				}
				else
				{
					long ans=pow(fibo1,fibo2,N-2);
					System.out.println(ans);
					
				}
				T--;
			}
		}

	}
	private static void product(long A[][],long B[][])
	{
		long A1=((A[0][0]*B[0][0])%con+(A[0][1]*B[1][0])%con)%con;
		long A2=((A[0][0]*B[0][1])%con+(A[0][1]*B[1][1])%con)%con;
		long A3=((A[1][0]*B[0][0])%con+(A[1][1]*B[1][0])%con)%con;
		long A4=((A[1][0]*B[0][1])%con+(A[1][1]*B[1][1])%con)%con;
		A[0][0]=A1;
		A[0][1]=A2;
		A[1][0]=A3;
		A[1][1]=A4;
		
		
	}
	private static long pow(long A[][],long B[][],long N)
	{
		while(N>0)
		{
			
			if((N&1)==1)
			{
				product(A, B);
			}
			product(B,B);
		//System.out.print("A=");
		//display(A);
		//	System.out.print("B=");
		//	display(B);
			N>>=1;
		}
		return A[0][0];
	}
	private static void display(long M[][])
	{
		System.out.println(M[0][0]+" "+M[0][1]+"\n"+M[1][0]+" "+M[1][1]);
	}
	
}

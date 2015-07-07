package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class XoringNinja{
private static final long con=1000000007;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());
			if((s=br.readLine())!=null)
			{
				st=new StringTokenizer(s);
				long a=0;long p=1;
				for(int i=0;i<N;i++)
				{
					int n=Integer.parseInt(st.nextToken());
					a|=n;
					if(i>0)
					{
						p=p%con*2;
					}
				}
				p=(p*a)%con;
				System.out.println(p);
				
			}
		}
				
	}

}

package projectEuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler08 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine().trim());
		
		String s;
		StringTokenizer st;
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
				int K=Integer.parseInt(st.nextToken());
				String Num=br.readLine().trim();
				if(Num!=null){
					
				int max=Integer.MIN_VALUE;
				for(int i=0;i+K<N;i++)
				{
					String sub=Num.substring(i,i+K);
					int pro=1;
					for(int j=0;j<sub.length();j++)
					{
						int ch=sub.charAt(j)-48;
						pro*=ch;
					}
					if(pro>max)
						max=pro;
				}
				System.out.println(max);
				T--;
				}
			}
			
		}
	}
}

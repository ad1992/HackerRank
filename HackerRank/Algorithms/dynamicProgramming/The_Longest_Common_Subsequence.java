package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi
 *
 */
public class The_Longest_Common_Subsequence
 {

	public static void main(String[] args) throws IOException {		
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
			String s=br.readLine();
			StringTokenizer st=new StringTokenizer(s);
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());				
			String s1=br.readLine();
			String s2=br.readLine();
			String first[]=new String[n];
			String second[]=new String[m];
			st=new StringTokenizer(s1);
			for(int i=0;i<n;i++)
			{
				first[i]=st.nextToken();
			}
			st=new StringTokenizer(s2);
			for(int i=0;i<m;i++)
			{
				second[i]=st.nextToken();
			}
			String store[]=new String[n+1];			
			int lcs[][]=new int[n+1][m+1];int start1=0,start2=0;
			
			for(int i=0;i<=n;i++)
			{
				
				for(int j=0;j<=m;j++)
				{
				
					if(i==0|j==0){
						lcs[i][j]=0; 
						
					}
					else if((first[i-1].equals(second[j-1])))
					{
						lcs[i][j]=lcs[i-1][j-1]+1;					
						
					}
					
					else
					{
						
						lcs[i][j]=Math.max(lcs[i-1][j],lcs[i][j-1]);
						
					}
					
					}
				
				
			}
			
			//System.out.println(lcs[n][m]);
			String ans="";
			int i=n,j=m;
			while(i>0&&j>0)
			{
				if((first[i-1].equals(second[j-1])))
				{
					ans=first[i-1]+" "+ans;
					i--;
					j--;
				}
				else if(lcs[i][j-1]>lcs[i-1][j])			
				{
					j--;
				}
				else
					i--;
			}
					
			System.out.println(ans);
			/*for(int i=0;i<=n;i++)
			{
				
				for(int j=0;j<=m;j++)
				{
					System.out.print(store[i][j]+" ");
				}
				System.out.println();
			}*/
			
			
		}
}

	

package projectEuler;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */

public class ProjectEuler81 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine().trim());
		long maze[][]=new long[N][N];		
		String s;
		StringTokenizer st;
	
		for(int i=0;i<N;i++)
		{
			
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				for(int j=0;j<N;j++)
				{
					maze[i][j]=Long.parseLong(st.nextToken());
				}
			}
		}
		long minPath[][]=new long[N][N];
		
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				if(i==0&&j==0)
					minPath[i][j]=maze[0][0];
				else if(i==0)
				{
					minPath[i][j]=maze[i][j]+minPath[i][j-1];
				}
				else if(j==0)
				{
					minPath[i][j]=maze[i][j]+minPath[i-1][j];
				}
				else
				{
					minPath[i][j]=maze[i][j];
					minPath[i][j]=Math.min(minPath[i][j]+minPath[i][j-1], minPath[i][j]+minPath[i-1][j]);
				}
			}
			
		}
		/*for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.println(minPath[i][j]);
			}
		}*/
		System.out.println(minPath[N-1][N-1]);

	}

}

package dynamicProgramming.the_coin_change_problem;

import java.util.*;

/**
 * @author Aakansha Doshi
 *
 */
public class The_Coin_Change_Problem

 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int i=0;
		int coin[]=new int[M];
		sc.nextLine();
		while(i<M)
		{
				coin[i]=sc.nextInt();
				i++;
				
		}
		long ways[][]=new long[N+1][M+1];
		for(i=0;i<=M;i++)
		{
			ways[0][i]=1;
		}
		
		for(i=1;i<=N;i++)
		{
			for(int j=1;j<=M;j++)
			{
				
				if(coin[j-1]<=i)
				{
					ways[i][j]+=ways[i-coin[j-1]][j];
				}
				if(j>1)
				{
					ways[i][j]+=ways[i][j-1];
				}
				
			}
		}
        System.out.println(ways[N][M]);
        sc.close();
    }
}
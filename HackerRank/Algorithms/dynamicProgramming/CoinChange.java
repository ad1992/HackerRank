package dynamicProgramming;

import java.util.Scanner;

/**
 * @author Aakansha Doshi
 *
 */
public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		int ways[][]=new int[N+1][M+1];
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

	}

}

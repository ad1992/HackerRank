package projectEuler;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler77 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		//To generate prime numbers below 1000
		/*int prime[]=new int[1001];
		for(int i=0;i<=1000;i++)
			prime[i]=i;
		prime[0]=prime[1]=-1;
		for(int i=2;i<=1000;i++)
		{
			if(prime[i]==i)
			{
				for(int j=i;j<=1000;j+=i)
				{
					prime[j]=i;
				}
			}
		}
		for(int i=2;i<=1000;i++)
		{
			if(prime[i]==i)
			{
				System.out.print(i+",");
			}
		}*/
		 int prime[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,
				107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,
				229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,
				359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,
				491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,
				641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,
				787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,
				941,947,953,967,971,977,983,991,997};
		int T=Integer.parseInt(br.readLine());
		while(T-->0)
		{
			int num=Integer.parseInt(br.readLine().trim());
			long ans=countways(num,prime);
			System.out.println(ans);
		}

	}
	private static long countways(int num,int prime[]) {
		// TODO Auto-generated method stub
		long ways[]=new long[num+1];
		ways[0]=1;
		for(int i=0;i<prime.length;i++)
		{
			for(int j=prime[i];j<=num;j++)
				ways[j]+=ways[j-prime[i]];
		}
		return ways[num];
	}
}

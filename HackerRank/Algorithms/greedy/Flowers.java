package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You and your K-1 friends want to buy N flowers. Flower number i has
 *         cost ci. Unfortunately the seller does not want just one customer to
 *         buy a lot of flowers, so he tries to change the price of flowers for
 *         customers who have already bought some flowers. More precisely, if a
 *         customer has already bought x flowers, he should pay (x+1)*ci dollars
 *         to buy flower number i. You and your K-1 friends want to buy all N
 *         flowers in such a way that you spend the least amount of money. You
 *         can buy the flowers in any order.
 * 
 *         Input:
 * 
 *         The first line of input contains two integers N and K (K <= N). The
 *         next line contains N space separated positive integers c1,c2,...,cN.
 * 
 *         Output:
 * 
 *         Print the minimum amount of money you (and your friends) have to pay
 *         in order to buy all N flowers.
 * 
 */
public class Flowers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int arr[] = new int[N];
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int sum=0;
		int i=N-1;
		int c=1;
		while(i>=0)
		{
			for(int j=1;j<=K&&i>=0;j++)
			{
				sum+=(c*arr[i]);
				i--;
			}
			c++;
		}
		System.out.println(sum);
	}

}

package bit_manipulation.Lonely_Integer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         There are N integers in an array A. All but one integer occur in
 *         pairs. Your task is to find the number that occurs only once.
 * 
 *         Input Format
 * 
 *         The first line of the input contains an integer N, indicating the
 *         number of integers. The next line contains N space-separated integers
 *         that form the array A.
 * 
 *         Constraints
 * 
 *         1≤N<100 N % 2=1 (N is an odd number) 0≤A[i]≤100,∀i∈[1,N]
 * 
 *         Output Format
 * 
 *         Output S, the number that occurs only once.
 * 
 */
public class Lonely_Integer {

	public static void main(String[] args)throws IOException,NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(s);
		int xor=0;
		for(int i=0;i<N;i++)
		{
			int num=Integer.parseInt(st.nextToken());
			xor^=num;
		}
		System.out.println(xor);
		
	}

}

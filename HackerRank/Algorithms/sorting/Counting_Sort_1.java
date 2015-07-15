package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 		  
 * 
 *         Challenge
 *         Given a list of integers, can you count and output the
 *         number of times each value appears?
 * 
 *         Hint: There is no need to sort the data, you just need to count it.
 * 
 *         Input Format There will be two lines of input:
 * 
 *         n - the size of the list ar - n space-separated numbers that make up
 *         the list
 * 
 *         Output Format Output the number of times every number from 0 to 99
 *         (inclusive) appears on the list.
 * 
 */
public class Counting_Sort_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
		int N=Integer.parseInt(br.readLine());		
		int count[]=new int[100];
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			int num=Integer.parseInt(st.nextToken());			
			count[num]++;
		}
		for(int i=0;i<N;i++)
		{
			System.out.print(count[i]+" ");
		}

	}

}

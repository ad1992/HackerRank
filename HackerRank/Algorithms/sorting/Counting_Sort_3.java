package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Challenge You will be given a list that contains both integers and
 *         strings. In this challenge you just care about the integers. For
 *         every value i from 0to99, can you output L, the number of elements
 *         that are less than or equal to i?
 * 
 *         Input Format - n, the size of the list ar. - n lines follow, each
 *         containing an integer x and a string s.
 * 
 *         Output Format Output L for all numbers from 0 to 99 (inclusive).
 * 
 */
public class Counting_Sort_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
		int N=Integer.parseInt(br.readLine());		
		int count[]=new int[100];		
		
		for(int i=0;i<N;i++)
		{
			String s=br.readLine();
		    StringTokenizer st=new StringTokenizer(s);
            int num=Integer.parseInt(st.nextToken());
            st.nextToken();
			count[num]++;
		}
		for(int i=1;i<100;i++)
		{
			count[i]+=count[i-1];
			
		}
		for(int i=0;i<100;i++)
		{
			System.out.print(count[i]+" ");
		}
			
	}

}

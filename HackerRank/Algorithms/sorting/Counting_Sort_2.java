package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Challenge Given an unsorted list of integers, output the integers in
 *         order.
 * 
 *         Hint: You can use your previous code that counted the items to print
 *         out the actual values in order.
 * 
 *         Input Format There will be two lines of input:
 * 
 *         n - the size of the list ar - n space separated numbers that belong
 *         to the list
 * 
 *         Output Format Output all the numbers of the list in order.
 * 
 */
public class Counting_Sort_2 {

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
		for(int i=0;i<100;i++)
		{
			if(count[i]>0)
			{
				for(int j=1;j<=count[i];j++)
					System.out.print(i+" ");
			}
		}

	}

}

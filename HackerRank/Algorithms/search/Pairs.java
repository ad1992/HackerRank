package search;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Given N integers, count the number of pairs of integers whose
 *         difference is K.
 * 
 *         Input Format The first line contains N and K. The second line
 *         contains N numbers of the set. All the N numbers are unique.
 * 
 *         Output Format An integer that tells the number of pairs of integers
 *         whose difference is K.
 * 
 */
public class Pairs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		int N=Integer.parseInt(st.nextToken());
		long K=Long.parseLong(st.nextToken());
		Set<Long> set=new HashSet<Long>();
		long arr[]=new long[N];
		s=br.readLine().trim();
        st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			long num=Long.parseLong(st.nextToken());
			arr[i]=num;
			set.add(num);
		}
		long count=0l;
		for(int i=0;i<N;i++)
		{
			long num=arr[i]+K;
			if(set.contains(num))
			{
				count++;
			}
			
		}
		out.println(count);
		out.close();
				
		
	}

}

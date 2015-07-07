package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given an array of size N . You need to answer Q queries. Each
 *         Query contains 1 number x. For each query, you need to add x to each
 *         element of the array and then report the sum of absolute values in
 *         the array.
 * 
 *         Note : Changes to the array are permanent. See Sample for more
 *         clarification.
 * 
 *         Input Format
 * 
 *         First line contains N , number of elements in the array. Next line
 *         contains N space separated integers of the array. Next line contains
 *         Q(number of queries). Next line contains Q space separated
 *         integers(the number x).
 * 
 *         Output Format
 * 
 *         For each query , output the sum in a newline.
 * 
 * 
 * 
 */
public class Playing_with_numbers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine());
		s=br.readLine().trim();
        st=new StringTokenizer(s);
        int arr[]=new int[N];
        long sum=0l;
		for(int i=0;i<N;i++)
		{
			int num=Integer.parseInt(st.nextToken());
			arr[i]=num;
			sum+=arr[i];
			
		}
		int Q=Integer.parseInt(br.readLine());
		s=br.readLine().trim();
        st=new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
        	int num=Integer.parseInt(st.nextToken());
        	long ans=Math.abs(num*N)+Math.abs(sum);
        	sum+=(num*N);
        	out.println(ans);
        }
        out.close();

	}

}

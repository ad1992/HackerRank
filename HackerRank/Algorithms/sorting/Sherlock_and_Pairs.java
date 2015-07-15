package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Sherlock is given an array of N integers (A0, A1 ... AN−1 by Watson.
 *         Now Watson asks Sherlock how many different pairs of indices i and j
 *         exist such that i is not equal to j but Ai is equal to Aj.
 * 
 *         That is, Sherlock has to count the total number of pairs of indices
 *         (i,j) where Ai =Aj AND i≠j.
 * 
 *         Input Format The first line contains T, the number of test cases. T
 *         test cases follow. Each test case consists of two lines; the first
 *         line contains an integer N, the size of array, while the next line
 *         contains N space separated integers.
 * 
 *         Output Format For each test case, print the required answer on a
 *         different line.
 * 
 */
public class Sherlock_and_Pairs {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());	
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine());	
			long c=0l;
			long arr[]=new long[1000001];
			String s=br.readLine();
		    StringTokenizer st=new StringTokenizer(s);
			for(int i=0;i<N;i++)
			{
				
	            int num=Integer.parseInt(st.nextToken());            
	            arr[num]++;
				
			}
			for(int i=0;i<1000001;i++)
			{
				if(arr[i]>0)
                    c+=(arr[i]*(arr[i]-1));
			}
			System.out.println(c);
		}
		

	}

}

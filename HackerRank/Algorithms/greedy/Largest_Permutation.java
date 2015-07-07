package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given an array of N integers which is a permuation of the
 *         first N natural numbers. You can swap any two elements of the array.
 *         You can make at most K swaps. What is the largest permutation, in
 *         numerical order, you can make?
 * 
 *         Input Format The first line of the input contains two integers, N and
 *         K, the size of the input array and the maximum swaps you can make,
 *         respectively. The second line of the input contains a permutation of
 *         the first N natural numbers.
 * 
 *         Output Format Print the lexicographically largest permutation you can
 *         make with at most K swaps.
 * 
 */
public class Largest_Permutation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    String s;
        StringTokenizer st;
        s=br.readLine().trim();
        st=new StringTokenizer(s);
        int N=Integer.parseInt(st.nextToken());
        long K=Long.parseLong(st.nextToken());
        long arr[]=new long[N];
        s=br.readLine().trim();
        st=new StringTokenizer(s);
        for(int i=0;i<N;i++)
        {
        	arr[i]=Long.parseLong(st.nextToken());
        }
        int swaps=0;
        for(int i=0;i<N&&swaps<K;i++)
        {
        	long big=arr[i];
        	int pos=i;
        	boolean check=false;
        	for(int j=i+1;j<N;j++)
        	{
        		
        		if(big<arr[j])
        		{
        			big=arr[j];
        			pos=j;
        			check=true;
        		}
        		
        	}
        	if(check){
        		long temp;
        		temp=arr[i];
        		arr[i]=arr[pos];
        		arr[pos]=temp;
        		swaps++;
        	}
        
        	
        }
        for(int i=0;i<N;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	}

}

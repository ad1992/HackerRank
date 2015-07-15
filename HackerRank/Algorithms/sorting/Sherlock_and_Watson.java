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
 *         John Watson performs an operation called Right Circular Rotation on
 *         an integer array [a0,a1,...an−1]. Right Circular Rotation transforms
 *         the array from [a0,a1,...an−1] to [aN−1,a0,...,aN−2].
 * 
 *         He performs the operation K times and tests Sherlock's ability to
 *         identify the element at a particular position in the array. He asks Q
 *         queries. Each query consists of one integer, idx, for which you have
 *         to print the element at index idx in the rotated array, i.e. aidx.
 * 
 *         Input Format The first line consists of three integers, N, K, and Q,,
 *         separated by a single space. The next line contains N space-separated
 *         integers which indicate the elements of the array A. Each of the next
 *         Q lines contains one integer per line denoting idx.
 * 
 *         Output Format For each query, print the value at index idx in the
 *         updated array separated by newline.
 * 
 */
public class Sherlock_and_Watson {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder  ans=new StringBuilder();
		String s=br.readLine();
	    StringTokenizer st=new StringTokenizer(s);
	    int N=Integer.parseInt(st.nextToken());
	    int K=Integer.parseInt(st.nextToken());
	    int Q=Integer.parseInt(st.nextToken());
	    int arr[]=new int[N];
	    s=br.readLine();
	    st=new StringTokenizer(s);
	    for(int i=0;i<N;i++)
		{
			
            int num=Integer.parseInt(st.nextToken());            
            arr[i]=num;
			
		}
	    K=K%N;
	    if(K==0)
	    	K=N;
	    int start=N-K;
	   // System.out.println(arr[start]);
	    int newarr[]=new int[N];
	    int index=0;
	    for(int i=start;i<N;i++)
	    {
	    	newarr[index++]=arr[i];
	    	
	    }
	    for(int i=0;i<start;i++)
	    {
	    	newarr[index++]=arr[i];
	    }
	    
	    while(Q-->0)
	    {
	    	int idx=Integer.parseInt(br.readLine().trim());
	    	ans.append(newarr[idx]+"\n");
	    	
	    }
	    System.out.print(ans);
	}

}

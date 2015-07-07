package greedy;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Problem Statement
 * 
 *          
 *         Devendra is on cloud nine after seeing his crush smiling at him in
 *         class. At that very moment his professor singles him out and asks him
 *         a question. Devendra's mind is all too fuzzy with his crush and her
 *         smile to concentrate on anything else. Help him solve the problem :
 * 
 *         You are given a list of size N, initialized with zeroes. You have to
 *         perform M operations on the list and output the maximum of final
 *         values of all the N elements in the list. For every operation, you
 *         are given three integers a, b and k and you have to add value k to
 *         all the elements ranging from index a to b(both inclusive).
 * 
 *         Input Format First line will contain two integers N and M separated
 *         by a single space. Next M lines will contain three integers a, b and
 *         k separated by a single space. Numbers in list are numbered from 1 to
 *         N.
 * 
 *         Output Format A single line containing maximum value in the updated
 *         list.
 */
public class Algorithmic_Crush {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long arr[]=new long[N+1];
    
		while(M>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st = new StringTokenizer(s);
                int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				long k=Long.parseLong(st.nextToken());
				arr[a]+=k;
                if(b<N)
				    arr[b+1]-=k;
				M--;
				
			}
		}
        long max=arr[1];
		for(int i=2;i<=N;i++)
		{
			arr[i]+=arr[i-1];
			if(max<arr[i])
                max=arr[i];
			
		}
        out.println(max);
        out.close();
		

	}

}

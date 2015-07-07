package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Mark and Jane are very happy after having their first kid. Their son
 *         is very fond of toys, so Mark wants to buy some. There are N
 *         different toys lying in front of him, tagged with their prices, but
 *         he has only $K. He wants to maximize the number of toys he buys with
 *         this money.
 * 
 *         Now, you are Mark's best friend and have to help him buy as many toys
 *         as possible.
 * 
 *         Input Format The first line contains two integers, N and K, followed
 *         by a line containing N space separated integers indicating the
 *         products' prices.
 * 
 *         Output Format An integer that denotes maximum number of toys Mark can
 *         buy for his son.
 * 
 */
public class Mark_and_Toys {

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
        Arrays.sort(arr);
        int toys=0;
        int i=0;
        while(K-arr[i]>0)
        {
        	K=K-arr[i];
        	i++;
        	toys++;
        }
        System.out.println(toys);
	}

}

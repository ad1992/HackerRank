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
 *         Little Priyanka visited a kids' shop. There are N toys and their
 *         weight is represented by an array W=[w1,w2,…,wN]. Each toy costs 1
 *         unit, and if she buys a toy with weight w′, then she can get all
 *         other toys whose weight lies between [w′,w′+4] (both inclusive) free
 *         of cost.
 * 
 *         Input Format
 * 
 *         The first line contains an integer N i.e. number of toys. Next line
 *         will contain N integers, w1,w2,…,wN, representing the weight array.
 * 
 *         Output Format
 * 
 *         Minimum units with which Priyanka could buy all of toys.
 * 
 */
public class Priyanka_and_Toys {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine().trim());
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		int arr[]=new int[10001];
		for(int i=0;i<N;i++)
		{
			int num=Integer.parseInt(st.nextToken());
			arr[num]++;
		}
		int unit=0;
		int i=0;
		while(i<=10000)
		{
			if(arr[i]>0)
			{
				unit++;
				i+=5;
				
			}
			else
			{
				//unit++;
				i++;
			}
		}
		System.out.println(unit);
	}

}

package dynamicProgramming.equal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Equal {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim());
			int arr[]=new int[N];
			s=br.readLine().trim();
			st=new StringTokenizer(s);
			int min=Integer.MAX_VALUE;
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(st.nextToken());
				min=Math.min(min, arr[i]);
			}
			int minop=Integer.MAX_VALUE;
			int size=5;
			if(min<size)
				size=min;
			int total[]=new int[size+1];
			for(int i=0;i<=size;i++)
			{
				for(int j=0;j<N;j++)
				{
					int left=arr[j]-(min-i);
					total[i]+=reduce(left);
				}
				minop=Math.min(minop,total[i]);
			}
			System.out.println(minop);
		}
	}

	private static int reduce(int left) {
		int steps=0;
		if(left>=5)
		{
			steps=left/5;
			left=left%5;
		}
		if(left>=2)
		{
			steps+=left/2;
			left=left%2;
		}
		steps+=left;
		return steps;
	}

}

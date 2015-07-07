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
 *         Problem Statement
 * 
 *         In Jim's Burger, n hungry burger fans are ordering burgers. The ith
 *         order is placed by the ith fan at ti time and it takes di time to
 *         procees. What is the order in which the fans will get their burgers?
 * 
 *         Input Format On the first line you will get n, the number of orders.
 *         Then n lines will follow. On the (i+1)th line, you will get ti and di
 *         separated by a single space.
 * 
 *         Output Format Print the order ( as single space separated integers )
 *         in which the burger fans get their burgers. If two fans get the
 *         burger at the same time, then print the smallest numbered order
 *         first.(remember, the fans are numbered 1 to n).
 * 
 * 
 * 
 */
public class Jim_and_the_Orders {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s1;
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine().trim());
		long time[]=new long[N+1];
		int order[]=new int[N+1];
		int i=1;
		while (i<=N) {

			if ((s1 = br.readLine().trim()) != null) {
				st = new StringTokenizer(s1);
				long t = Long.parseLong(st.nextToken());
				long d = Long.parseLong(st.nextToken());
				time[i]=t+d;
				order[i]=i;
				i++;			
				
			}
		}
		for(i=1;i<=N;i++)
		{
			long small=time[i];
			int pos=i;
			for(int j=i+1;j<=N;j++)
			{
				if(time[j]<small)
				{
					small=time[j];
					pos=j;
				}
			}
			long temp=time[i];
			time[i]=time[pos];
			time[pos]=temp;
			int temp1=order[i];
			order[i]=order[pos];
			order[pos]=temp1;
		}
		for(i=1;i<=N;i++)
			out.print(order[i]+ " ");
        out.close();

	}
    

}

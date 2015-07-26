package fundamentals.reverse_game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Reverse_Game {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int T=Integer.parseInt(br.readLine().trim());
		while(T-->0)
		{
			String s=br.readLine().trim();
			StringTokenizer st=new StringTokenizer(s);
			int N=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(st.nextToken());
            int ans;
			if(K>=N/2)
            {
                int diff=N-1-K; 
                ans=diff*2;
            }
            else
            {
                ans=K*2+1;    
            }
			System.out.println(ans);
		}
	}

}

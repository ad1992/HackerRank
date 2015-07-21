package bit_manipulation.Lonely_Integer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi 
 */
public class Lonely_Integer {

	public static void main(String[] args)throws IOException,NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		String s=br.readLine().trim();
		StringTokenizer st=new StringTokenizer(s);
		int xor=0;
		for(int i=0;i<N;i++)
		{
			int num=Integer.parseInt(st.nextToken());
			xor^=num;
		}
		System.out.println(xor);
		
	}

}

package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi Problem Statement
 * 
 *         Taum is planning to celebrate the birthday of his friend, Diksha.
 *         There are two types of gifts that Diksha wants from Taum: one is
 *         black and the other is white. To make her happy, Taum has to buy B
 *         number of black gifts and W number of white gifts.
 * 
 *         The cost of each black gift is X units. The cost of every white gift
 *         is Y units. The cost of converting each black gift into white gift or
 *         vice versa is Z units.
 * 
 *         Help Taum by deducing the minimum amount he needs to spend on
 *         Diksha's gifts.
 * 
 *         Input Format
 * 
 *         The first line will contain an integer T which will be the number of
 *         test cases. There will be T pairs of lines. The first line of each
 *         test case will contain the values of integers B and W. Another line
 *         of each test case will contain the values of integers X, Y, and Z.
 * 
 *         Constraints 1≤T≤10 0≤X,Y,Z,B,W≤109
 * 
 *         Output Format
 * 
 *         T lines, each containing an integer: the minimum amount of units Taum
 *         needs to spend on gifts.
 * 
 */
public class Taum_and_Bday {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				long B=Long.parseLong(st.nextToken());
				long W=Long.parseLong(st.nextToken());
				if((s=br.readLine().trim())!=null)
				{
					st=new StringTokenizer(s);
					long X=Long.parseLong(st.nextToken());
					long Y=Long.parseLong(st.nextToken());
					long Z=Long.parseLong(st.nextToken());
					long price=0l;
					if(X>Y+Z)
					{
						price=B*(Y+Z)+(W*Y);
					}
					else if(Y>X+Z)
					{
						price=W*(X+Z)+(B*X);
					}
					else
					{
						price=B*X+W*Y;
					}
					System.out.println(price);
					T--;
				}
			}
		}

	}

}

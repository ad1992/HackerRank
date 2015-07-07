package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         String Reduction (25 Points)
 * 
 *         Given a string consisting of letters, a, b and c, we can perform the
 *         following operation: Take any two adjacent distinct characters and
 *         replace them with the third character. For example, if 'a' and 'c'
 *         are adjacent, they can replaced by 'b'. Find the smallest string
 *         which we can obtain by applying this operation repeatedly?
 * 
 *         Input: The first line contains the number of test cases T. T test
 *         cases follow. Each test case contains the string you start with.
 * 
 *         Output: Output T lines, one for each test case, containing the
 *         smallest length of the resultant string after applying the operations
 *         optimally.
 * 
 * 
 * 
 */
public class String_Reduction {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				int a=0,b=0,c=0;
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)=='a')
						a++;
					else if(s.charAt(i)=='b')
						b++;
					else
						c++;
				}
				if((a==0&&b==0&&c>0)||(a==0&&c==0&&b>0)||(b==0&&c==0&&a>0))				{
					out.println(s.length());
				}
				else if((a&1)==(b&1)&&(b&1)==(c&1))
				{
					out.println(2);
				}
				else
				{
					out.println(1);
				}
                T--;
			}
		}
        out.close();

	}

}

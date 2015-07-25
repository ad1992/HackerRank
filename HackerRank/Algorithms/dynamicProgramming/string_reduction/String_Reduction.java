package dynamicProgramming.string_reduction;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
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

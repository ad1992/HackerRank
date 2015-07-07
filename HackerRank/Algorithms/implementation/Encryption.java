package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 * 		   problem link
 * 		   https://www.hackerrank.com/challenges/encryption
 * 
 *       
 */
public class Encryption {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		
	
			    s=br.readLine().trim();	
				int len=s.length();
				int sqr=(int) Math.sqrt(len);
				int row,col;
				if(sqr*sqr==len)
				{
					row=col=sqr;
				}
				else
				{
					row=sqr+1;
					col=sqr+1;
				}
				String ans="";
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<len;j+=col)
					{
						if(i+j<len)
						ans+=s.charAt(i+j);
					}
					ans+=" ";
				}
				out.println(ans);       	
		        out.close();

	}

}

package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Anagram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		int T=Integer.parseInt(br.readLine());
		String s;
		StringTokenizer st;
		
		while(T-->0)
		{
			int replace=0;
			if((s=br.readLine())!=null)
			{
				if(s.length()%2==0)
				{
					String s1=s.substring(0,s.length()/2);
					String s2=s.substring(s.length()/2);
					int arr[]=new int[123];
					for(int i=0;i<s1.length();i++)
					{
						int ch=s1.charAt(i);
						arr[ch]++;
					}
					for(int i=0;i<s2.length();i++)
					{
						int ch=s2.charAt(i);
						if(arr[ch]==0)
						{
							replace++;
						}
						else
							arr[ch]--;
						
					}
					
				}
				else
					replace=-1;
				System.out.println(replace);
			}
		}
	}

}

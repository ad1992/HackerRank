package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given a string of lower case letters. Your task is to figure
 *         out the index of the character on whose removal it will make the
 *         string a palindrome. There will always be a valid solution.
 * 
 *         In case the string is already a palindrome, then -1 is also a valid
 *         answer along with possible indices.
 * 
 *         Input Format
 * 
 *         The first line contains T, i.e. the number of test cases. T lines
 *         follow, each containing a string.
 * 
 *         Output Format
 * 
 *         Print the position (0 index) of the letter by removing which the
 *         string turns into a palindrome. For a string, such as
 * 
 *         bcbc
 * 
 *         we can remove b at index 0 or c at index 3. Both answers are
 *         accepted.
 */
public class Palindrome_Index {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s1;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s1=br.readLine().trim())!=null)
			{
				int len=s1.length();
                int start=0,end=len-1;int pos=-1;
				char arr[]=s1.toCharArray();
				while(start<=end)
				{
					if(arr[start]!=arr[end])
					{
					
						if(end>0&&arr[start]==arr[end-1]&&checkpal(s1.substring(start+1, end-1)))
						{
							pos=end;
							
						}
						else if(start<len-1&&arr[end]==arr[start+1]&&checkpal(s1.substring(start+2, end)))
						{
							pos=start;
						}
                        //System.out.println(start+" "+end);
						break;
					}
                    start++;
                    end--;
				}
				
				out.println(pos);
				
				T--;
				
			}
		}
        out.close();
	}

	private static boolean checkpal(String s) {
		// TODO Auto-generated method stub
		int i=0,j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}

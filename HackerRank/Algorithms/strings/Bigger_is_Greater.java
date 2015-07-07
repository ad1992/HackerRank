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
 *         Given a word w, rearrange the letters of w to construct another word
 *         s in such a way that s is lexicographically greater than w. In case
 *         of multiple possible answers, find the lexicographically smallest
 *         one.
 * 
 *         Input Format
 * 
 *         The first line of input contains t, the number of test cases. Each of
 *         the next t lines contains w.
 * 
 *         Constraints 1≤t≤105 1≤|w|≤100 w will contain only lower-case English
 *         letters and its length will not exceed 100.
 * 
 *         Output Format
 * 
 *         For each testcase, output a string lexicographically bigger than w in
 *         a separate line. In case of multiple possible answers, print the
 *         lexicographically smallest one, and if no answer exists, print no
 *         answer.
 *         
 *         Reference:http://www.nayuki.io/page/next-lexicographical-permutation-algorithm
 * 
 */
public class Bigger_is_Greater {

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
				char arr[]=s.toCharArray();
				String ans="no answer";
				if(next_permute(arr))
				{
					ans=new String(arr);
				}
				out.println(ans);
				T--;
			}
		}
		out.close();

	}

	private static boolean next_permute(char[] arr) {
		// TODO Auto-generated method stub
		int i=arr.length-1,j;
		//Finding the longest decreasing suffix from end
		while(i>0&&arr[i]<=arr[i-1])
		{
			i--;
		}
		if(i<=0)
			return false;
		char pivot=arr[i-1];
		for(j=arr.length-1;j>=i;j--)
		{
			if(arr[j]>pivot)
			{
				pivot=arr[j];
				break;
			}
		}
		
		//Swapping arr[i] and pivot
		
		char temp=arr[i-1];
		arr[i-1]=pivot;
		arr[j]=temp;
		
		//Reversing the suffix
		
		j=arr.length-1;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return true;
	}

}

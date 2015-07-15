package sorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Challenge
 *         In the previous challenge, you created a "helper array"
 *         that contains information about the starting position of each element
 *         in a sorted array. Can you use this array to help you create a sorted
 *         array of the original list?
 * 
 *         Hint: You can go through the original array to access the strings.
 *         You can then use your helper array to help determine where to place
 *         those strings in the sorted array. Be careful about being one off.
 * 
 *         Details and a Twist You will be given a list that contains both
 *         integers and strings. Can you print the strings in order of their
 *         accompanying integers? If the integers for two strings are equal,
 *         ensure that they are print in the order they appeared in the original
 *         list.
 * 
 *         The Twist - Your clients just called with an update. They don't want
 *         you to print the first half of the original array. Instead, they want
 *         you to print a dash for any element from the first half. So you can
 *         modify your counting sort algorithm to sort the second half of the
 *         array only.
 * 
 *         Input Format - n, the size of the list ar. - n lines follow, each
 *         containing an integer x and a string s.
 * 
 *         Output Format Print the strings in their correct order.
 * 
 */
public class The_Full_Counting_Sort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
		int N=Integer.parseInt(br.readLine());	
		int mid=N/2;
		StringBuilder ans=new StringBuilder();
		StringBuilder arr[]=new StringBuilder[100];
		for(int i=0;i<100;i++)
		{
			arr[i]=new StringBuilder();
		}
		for(int i=1;i<=N;i++)
		{
			String s=br.readLine();
			//System.out.println(s);
		    StringTokenizer st=new StringTokenizer(s);
            int num=Integer.parseInt(st.nextToken());
            String str=st.nextToken();
         	if(i<=mid)
         		str="-";
         	arr[num].append(str+" ");
         	
			
		}
		for(int i=0;i<100;i++)
		{
			if(arr[i].length()>0)
			{
				ans.append(arr[i]);
			}
		}
		System.out.println(ans);
	}

}

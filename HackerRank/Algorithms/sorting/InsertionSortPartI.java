package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class InsertionSortPartI {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));			
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		String s=br.readLine();
		StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int temp=arr[size-1];
		int i=size-2;
		while(i>=0&&temp<arr[i])
		{
			arr[i+1]=arr[i];
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[j]+" ");
			}
			System.out.println();
			i--;
		}
		arr[i+1]=temp;
		for(int j=0;j<size;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}

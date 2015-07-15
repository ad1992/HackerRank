package sorting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Challenge
 *         Given a list of numbers, can you find the median?
 * 
 *         Input Format There will be two lines of input:
 * 
 *         n - the size of the array ar - n numbers that makes up the array
 * 
 *         Output Format Output one integer, the median.
 * 
 */
public class Find_the_Median {
private static boolean found=false;
private static int median=0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());	
		int arr[]=new int[N];		
		String s=br.readLine();
	    StringTokenizer st=new StringTokenizer(s);
		for(int i=0;i<N;i++)
		{
			
            int num=Integer.parseInt(st.nextToken());            
            arr[i]=num;
			
		}
       
		quickSort(arr, 0, N - 1);
        if(!found)
        {
        	if(!found&&N==0){
        		median=arr[0];
        	}
        		
        	else if(!found)
        	{
        		median=arr[N/2];              
        	}
        }
           
		System.out.println(median);

	}
	private static int partition(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int pivot = arr[j];
		int small = i - 1;
		for (int k = i; k < j; k++) {
			if (arr[k] <= pivot) {
				small++;
				swap(arr, k, small);

			}

		}
		swap(arr, j, small + 1);		
		return small + 1;

	}
	private static void swap(int[] arr, int k, int small) {
		// TODO Auto-generated method stub
		int temp;
		temp = arr[k];
		arr[k] = arr[small];
		arr[small] = temp;

	}
	 private static void quickSort(int[] arr,int i,int j) {
			// TODO Auto-generated method stub
		
			if(i<j&&!found)
			{
				int pos=partition(arr,i,j);
				
				//printArray(arr, 0, arr.length-1);
				if(pos==arr.length/2)
				{
					found=true;
					median=arr[pos];
                    return;
				}
				
				quickSort(arr,i,pos-1);
				quickSort(arr,pos+1,j);
				
			}
			
			
			
		}
	 private static void printArray(int[] arr, int i, int j) {
			for (int k = i; k <= j; k++) {
				System.out.print(arr[k] + " ");
			}
			System.out.println("");
		}
}

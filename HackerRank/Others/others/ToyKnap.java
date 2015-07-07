package others;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/**
 * @author Aakansha Doshi
 *
 */
public class ToyKnap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
        StringTokenizer st;
		String s=br.readLine();
        st=new StringTokenizer(s);
		int n=Integer.parseInt(st.nextToken());
       int k=Integer.parseInt(st.nextToken());
        int price[]=new int[n];		
		s=br.readLine();	
		st=new StringTokenizer(s);
		for(int i=0;i<n;i++)
		{
			price[i]=Integer.parseInt(st.nextToken());
		}	
        int knapsack[]=new int[k+1];
		for(int i=0;i<n;i++)
		{
            knapsack[i]=Integer.MIN_VALUE;
        }
	
		for (int i = 0; i <= k; i++)
		   {
		       for (int j = 0; j<n;j++)
		       {
		           if (i==0 || j==0)
		               knapsack[i]= 0;
		           else if (price[j] <= i && knapsack[i]<knapsack[i-price[j]]+1)
		                 knapsack[i]= knapsack[i-price[j]]+1;;              
		                    
               }  
         System.out.println(knapsack[i]+" "+i);
		          
		          
		           
        }
        System.out.println(knapsack[k]);
    }}


		
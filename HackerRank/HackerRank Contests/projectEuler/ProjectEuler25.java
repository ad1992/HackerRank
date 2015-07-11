package projectEuler;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler25 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		
		int T=Integer.parseInt(br.readLine().trim());
		
		while(T-->0)
		{
			int N=Integer.parseInt(br.readLine().trim())-1;
			float p=(float) ((1+Math.sqrt(5))/2);
			double val= (double) ((Math.log(10)*N)+(Math.log(5)/2))/(Math.log(p));			
			System.out.println((long)Math.ceil(val));
		}
		
	}
	

}

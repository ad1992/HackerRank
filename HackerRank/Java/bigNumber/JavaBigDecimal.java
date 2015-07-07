package bigNumber;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Arrays;

public class JavaBigDecimal {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
		String s;
		BigDecimal[] arr=new BigDecimal[n];
		int i=0;
		while(i<n)
		{
			if((s=br.readLine().trim())!=null)
			{
				
				 arr[i]=new BigDecimal(s);
               
				i++;
			}
		}
		Arrays.sort(arr);
		BigDecimal a=new BigDecimal("-1");
		for(i=arr.length-1;i>=0;i--)
		{
			BigDecimal num=arr[i];
			if(num.compareTo(BigDecimal.ONE)<0&&num.compareTo(BigDecimal.ZERO)>0){
			System.out.println(arr[i].toPlainString().substring(1));
            }
			else if(num.compareTo(a)>0&&num.compareTo(BigDecimal.ZERO)<0){
				System.out.println(arr[i].toPlainString().substring(2));
			}
            else
             {
                System.out.println(arr[i].toPlainString());
                
            }
		}
		
		
	}
}

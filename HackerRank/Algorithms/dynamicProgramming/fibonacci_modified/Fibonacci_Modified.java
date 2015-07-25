package dynamicProgramming.fibonacci_modified;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author Aakansha Doshi
 *
 */
public class Fibonacci_Modified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int N=sc.nextInt();
		BigDecimal c=new BigDecimal(0);
		BigDecimal a=new BigDecimal(A);
		BigDecimal b=new BigDecimal(B);
		for(int i=3;i<=N;i++)
		{
			BigDecimal d=b.multiply(b);
			c=a.add(d);
			a=b;
			b=c;
		}
		System.out.println(c);
		sc.close();
	}

}

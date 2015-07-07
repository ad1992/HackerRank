package warmup;

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
 *         You are given an integer N. Print the factorial of this number.
 * 
 *         N!=N×N−1×N−2×⋯×3×2×1
 * 
 *         Note: Factorials of N>20 can't be stored even in a 64−bit long long
 *         variable. Big integers must be used for such calculations. Languages
 *         like Java, Python, Ruby etc. can handle big integers but we need to
 *         write additional code in C/C++ to handle such large values.
 * 
 *         We recommend solving this challenge using BigIntegers.
 * 
 *         Input Format Input consists of a single integer N.
 * 
 *         Constraints 1≤N≤100
 * 
 *         Output Format Output the factorial of N.
 * 
 */
public class Extra_long_factorials {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine().trim());
		int arr[] = new int[1000000];
		int size = 1;
		arr[0] = 1;
		for (int i = 2; i <= N; i++) {
			size = fact(i, arr, size);
		}
		// long sum=0;
		for (int i = size - 1; i >= 0; i--) {
			// sum+=arr[i];
			out.print(arr[i]);
		}
		out.println();
		out.close();

	}

	private static int fact(int n, int[] arr, int size) {
		// TODO Auto-generated method stub
		int carry = 0;
		int i;
		for (i = 0; i < size; i++) {
			int ans = n * arr[i] + carry;
			arr[i] = ans % 10;
			carry = ans / 10;

		}
		while (carry > 0) {
			arr[i] = carry % 10;
			carry /= 10;
			i++;
		}
		return i;
	}

}

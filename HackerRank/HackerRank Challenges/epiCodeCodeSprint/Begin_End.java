package epiCodeCodeSprint;

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
 *         You are given a function f(x), where f(x) is 1 if the first and last
 *         characters of string x are equal; else it is 0. You are given a
 *         string S and you have to find the sum of f(x) for all substrings x of
 *         given string S.
 * 
 *         Note: A substring is a contiguous slice of string S[i:j] such that
 *         i≤j. It is a contiguous slice of the original string.
 * 
 *         Input Format The first line contains an integer N, length of S. The
 *         second line contains a string S. S will contain only lower case
 *         characters (a−z).
 * 
 *         Constraints 1≤|S|≤106 1≤|x|
 * 
 *         Output Format Print the required answer.
 * 
 */
public class Begin_End {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		int N = Integer.parseInt(br.readLine().trim());
		s = br.readLine().trim();
		long count[] = new long[123];
		for (int i = 0; i < s.length(); i++) {
			int ch = s.charAt(i);
			count[ch]++;
		}
		long ans = 1l;
		ans = ans * N;
		for (int i = 0; i <= 122; i++) {
			if (count[i] > 0) {
				long a = ((count[i]) * (count[i] - 1)) / 2;
				ans += a;
			}
		}
		out.println(ans);
		out.close();
	}

}

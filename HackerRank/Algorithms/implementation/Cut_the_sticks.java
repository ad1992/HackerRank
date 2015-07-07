package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given N sticks, where the length of each stick is a positive
 *         integer. A cut operation is performed on the sticks such that all of
 *         them are reduced by the length of the smallest stick.
 * 
 *         Suppose we have six sticks of the following lengths:
 * 
 *         5 4 4 2 2 8
 * 
 *         Then, in one cut operation we make a cut of length 2 from each of the
 *         six sticks. For the next cut operation four sticks are left (of
 *         non-zero length), whose lengths are the following:
 * 
 *         3 2 2 6
 * 
 *         The above step is repeated until no sticks are left.
 * 
 *         Given the length of N sticks, print the number of sticks that are
 *         left before each subsequent cut operations.
 * 
 *         Note: For each cut operation, you have to recalcuate the length of
 *         smallest sticks (excluding zero-length sticks).
 * 
 *         Input Format The first line contains a single integer N. The next
 *         line contains N integers: a0, a1,...aN-1 separated by space, where ai
 *         represents the length of ith stick.
 * 
 *         Output Format For each operation, print the number of sticks that are
 *         cut, on separate lines.
 * 
 */
public class Cut_the_sticks {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		s = br.readLine().trim();
		st = new StringTokenizer(s);
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}
		Arrays.sort(arr);
		// System.out.println(arr);
		int i = 0;
		while (i < arr.length) {
			int lost = 0;
			int nextmin = Integer.MAX_VALUE, pos = -1;
			int cur = arr[i];

			for (int j = i; j < arr.length; j++) {

				if (arr[j] > 0) {

					arr[j] -= cur;
					if (arr[j] == 0) {
						lost++;
						// System.out.println(lost+" "+i);
					}
				}
				if (arr[j] > 0 && arr[j] < nextmin) {
					pos = j;
					nextmin = arr[j];
				}

			}
			out.println(N);
			N = N - lost;
			i = pos;
			if (pos == -1)
				break;

		}
		out.close();
	}

}

package epiCodeCodeSprint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         White Falcon has a sequence of integers A. You need to choose two
 *         contiguous disjoint subsequences of A, let's say x and y, of the same
 *         size, n.
 * 
 *         After that you will calculate the sum given by ∑xiyn−i+1 (1-indexed)
 * 
 *         White Falcon asks you to choose such two x and y that maximizes the
 *         above summation.
 * 
 *         Input Format The first line contains N that denotes size of A. The
 *         second line contains N integers, all elements of A.
 * 
 *         Constraints 2≤N≤3000 −106≤Ai≤106
 * 
 *         Output Format Print out a line that contains maximum summation that
 *         is obtainable from A under the conditions described above.
 * 
 * 
 * 
 */
public class White_Falcon_and_Sequence {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int N = Integer.parseInt(br.readLine().trim());
		s = br.readLine().trim();
		StringTokenizer st = new StringTokenizer(s);
		long arr[] = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long[][] mult = new long[N][N];
		long max = 0l;
		for (int i = 0; i < N - 1; i++) {
			mult[i][i + 1] = Math.max(0, arr[i] * arr[i + 1]);//to avoid negative numbers
			max = Math.max(max, mult[i][i + 1]);
			if (i < N - 3) {
				mult[i][i + 2] = Math.max(0, arr[i] * arr[i + 2]);
				max = Math.max(max, mult[i][i + 2]);
			}

		}

		for (int len = 4; len <= N; len++) {
			for (int i = 0, j = i + len - 1; j < N; i++, j++) {
				mult[i][j] = Math.max(0, arr[i] * arr[j]);
				mult[i][j] = Math.max(mult[i][j], arr[i] * arr[j]
						+ mult[i + 1][j - 1]);
				max = Math.max(max, mult[i][j]);

			}
		}

		System.out.println(max);

	}

}

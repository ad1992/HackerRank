package epiCodeCodeSprint;

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
 *         There are N boys and N girls. Only a boy and a girl can form a
 *         dancing pair (i.e. no same sex dancing pairs are allowed). The only
 *         other condition in making pairs is that their absolute difference in
 *         height should be less than or equal to K.
 * 
 *         Find the maximum number of pairs that can be formed so that everyone
 *         has a unique partner.
 * 
 *         Input Format The first line will contain two integers, N and K. The
 *         second line will contain N integers, the heights of N boys. The third
 *         line will contain N integers, the heights of N girls.
 * 
 *         Constraints 1≤N≤105 1≤K≤109 1≤height of boy or girl≤109
 * 
 *         Output Format A single line containing the maximum number of possible
 *         pairs.
 * 
 */
public class Dance_in_Pairs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		s = br.readLine();
		st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		long K = Long.parseLong(st.nextToken());
		long boy[] = new long[N];
		long girl[] = new long[N];
		s = br.readLine();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			boy[i] = Long.parseLong(st.nextToken());
		}
		s = br.readLine();
		st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {
			girl[i] = Long.parseLong(st.nextToken());
		}
		Arrays.sort(girl);
		Arrays.sort(boy);
		long ans = 0l;
		for (int i = 0; i < N; i++) {

			int l = 0, u = girl.length - 1, mid = 0;
			long n = boy[i] - K;
			int pos1 = -1;
			while (l <= u) {
				mid = (l + u) / 2;
				if (girl[mid] < n) {

					l = mid + 1;

				} else if (girl[mid] >= n) {

					if (girl[mid] > 0 && girl[mid] <= boy[i] + K)
						pos1 = mid;
					u = mid - 1;

				}
			}
			if (pos1 != -1) {
				ans++;
				// System.out.println(boy[i]+" "+girl[pos1]+" "+pos1);
				girl[pos1] = 0;
				// Arrays.sort(girl);
				for (int i1 = pos1; i1 >= 1; i1--) {
					girl[i1] = girl[i1 - 1];
					if (girl[i1] == 0) {

						break;
					}
				}
				girl[0] = 0;
			}

		}
		out.println(ans);
		out.close();
	}

}

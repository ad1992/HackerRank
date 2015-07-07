package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Problem Statement
 * 
 *         The professor is conducting a course on Discrete Mathematics to a
 *         class of N students. He is angry at the lack of their discipline, and
 *         he decides to cancel the class if there are fewer than K students
 *         present after the class starts.
 * 
 *         Given the arrival time of each student, your task is to find out if
 *         the class gets cancelled or not.
 * 
 *         Input Format
 * 
 *         The first line of the input contains T, the number of test cases.
 *         Each test case contains two lines. The first line of each test case
 *         contains two space-separated integers, N and K. The next line
 *         contains N space-separated integers, a1,a2,…,aN, representing the
 *         arrival time of each student.
 * 
 *         If the arrival time of a given student is a non-positive integer
 *         (ai≤0), then the student enters before the class starts. If the
 *         arrival time of a given student is a positive integer (ai>0), the
 *         student enters after the class has started.
 * 
 *         Output Format
 * 
 *         For each testcase, print "YES" (without quotes) if the class gets
 *         cancelled and "NO" (without quotes) otherwise.
 */
public class Angry_Professor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s1;
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine().trim());
		while (T > 0) {

			if ((s1 = br.readLine().trim()) != null) {
				st = new StringTokenizer(s1);
				int N = Integer.parseInt(st.nextToken());
				int K = Integer.parseInt(st.nextToken());
				if ((s1 = br.readLine().trim()) != null) {

					st = new StringTokenizer(s1);
					for (int i = 0; i < N; i++) {
						int num = Integer.parseInt(st.nextToken());
						if (num <= 0)
							K--;
						if (K == 0)
							break;
					}
					if (K == 0)
						out.println("NO");
					else
						out.println("YES");
					T--;
				}
			}
		}
		out.close();
	}

}

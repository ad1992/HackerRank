package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given a list of N people who are attending ACM-ICPC World
 *         Finals. Each of them are either well versed in a topic or they are
 *         not. Find out the maximum number of topics a 2-person team can know.
 *         And also find out how many teams can know that maximum number of
 *         topics.
 * 
 *         Note Suppose a, b, and c are three different people, then (a,b) and
 *         (b,c) are counted as two different teams.
 * 
 *         Input Format
 * 
 *         The first line contains two integers, N and M, separated by a single
 *         space, where N represents the number of people, and M represents the
 *         number of topics. N lines follow. Each line contains a binary string
 *         of length M. If the ith line's jth character is 1, then the ith
 *         person knows the jth topic; otherwise, he doesn't know the topic.
 * 
 *         Constraints 2≤N≤500 1≤M≤500
 * 
 *         Output Format
 * 
 *         On the first line, print the maximum number of topics a 2-person team
 *         can know. On the second line, print the number of 2-person teams that
 *         can know the maximum number of topics.
 * 
 * 
 * 
 */
public class ACMICPCTeam {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(st.nextToken());
		int topic[] = new int[T + 1];
		String arr[] = new String[N];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int or = 0;
				for (int k = 0; k < T; k++) {
					int ch1 = arr[i].charAt(k) - 48;
					int ch2 = arr[j].charAt(k) - 48;
					if ((ch1 | ch2) == 1) {
						or++;
					}
				}
				if (or > max) {
					max = or;
				}
				topic[or]++;
			}
		}
		System.out.println(max);
		System.out.println(topic[max]);

	}

}

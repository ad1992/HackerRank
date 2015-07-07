package epiCodeCodeSprint;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are the hiring manager of a startup and you are interviewing N
 *         candidates, each having an ID numbered from 1 to N. Each candidate
 *         has a score Ai calculated from their HackerRank tests. You start with
 *         patience P and lose patience X after each interview.
 * 
 *         One by one candidates enter your room in the sequence of their ID
 *         numbers. To save time you decide to give a rating of (P×Ai). In the
 *         end you hire the candidate with maximum rating. Print the ID of this
 *         candidate. NOTE: It is guaranteed that a unique ID gets selected.
 * 
 *         Input Format The first line begins with 3 space-separated integers,
 *         N, P, and X. The next line contains an array A[], containing the
 *         scores of the N candidates.
 * 
 *         Constraints 1≤N≤105 1≤P≤109 1≤X≤100 1≤Ai≤109
 * 
 *         Output Format Output the ID of the Applicant who get selected.
 * 
 */
public class Perfect_Hiring {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		StringTokenizer st;
		s = br.readLine();
		st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken());
		long P = Long.parseLong(st.nextToken());
		long X = Long.parseLong(st.nextToken());
		long arr[] = new long[N];
		s = br.readLine();
		st = new StringTokenizer(s);
		long max = Long.MIN_VALUE;
		int id = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			long score = arr[i] * P;
			if (score > max) {
				max = score;
				id = i;
			}
			P -= X;
		}
		out.println(id + 1);
		out.close();
	}

}

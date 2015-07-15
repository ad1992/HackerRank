package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Sample Challenge
 *         This is a simple challenge to get things started.
 *         Given a sorted array (ar) and a number (V), can you print the index
 *         location of V in the array?
 * 
 *         The next section describes the input format. You can often skip it,
 *         if you are using included methods.
 * 
 *         Input Format There will be three lines of input:
 * 
 *         V - the value that has to be searched. n - the size of the array. ar
 *         - n numbers that make up the array.
 * 
 *         Output Format Output the index of V in the array.
 * 
 */
public class Intro_to_Tutorial_Challenges {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		for (int i = 0; i < N; i++) {

			int n = Integer.parseInt(st.nextToken());
			arr[i] = n;
			if (arr[i] == num) {
				System.out.println(i);
				break;
			}

		}

	}

}

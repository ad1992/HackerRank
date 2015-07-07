package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         Alice recently started learning about cryptography and found that
 *         anagrams are very useful. Two strings are anagrams of each other if
 *         they have same character set and same length. For example strings
 *         "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad"
 *         are not.
 * 
 *         Alice decides on an encryption scheme involving 2 large strings where
 *         encryption is dependent on the minimum number of character deletions
 *         required to make the two strings anagrams. She need your help in
 *         finding out this number.
 * 
 *         Given two strings (they can be of same or different length) help her
 *         in finding out the minimum number of character deletions required to
 *         make two strings anagrams. Any characters can be deleted from any of
 *         the strings.
 * 
 *         Input Format Two lines each containing a string.
 * 
 *         Constraints 1 <= Length of A,B <= 10000 A and B will only consist of
 *         lowercase latin letter.
 * 
 *         Output Format A single integer which is the number of character
 *         deletions.
 */
public class Make_it_Anagram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s1, s2;
		s1 = br.readLine().trim();
		s2 = br.readLine().trim();
		int count1[] = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			int ch = s1.charAt(i) - 97;
			count1[ch]++;
		}
		int count2[] = new int[26];
		for (int i = 0; i < s2.length(); i++) {
			int ch = s2.charAt(i) - 97;
			count2[ch]++;
		}
		int delete = 0;
		for (int i = 0; i < 26; i++) {
			if (count1[i] > 0 && count2[i] > 0) {
				delete += Math.abs(count1[i] - count2[i]);
			} else {
				delete += count1[i] + count2[i];
			}

		}
		out.println(delete);
		out.close();
	}
}

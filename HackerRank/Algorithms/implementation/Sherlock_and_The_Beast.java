package implementation;

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
 *         Sherlock Holmes is getting paranoid about Professor Moriarty, his
 *         arch-enemy. All his efforts to subdue Moriarty have been in vain.
 *         These days Sherlock is working on a problem with Dr. Watson. Watson
 *         mentioned that the CIA has been facing weird problems with their
 *         supercomputer, 'The Beast', recently.
 * 
 *         This afternoon, Sherlock received a note from Moriarty, saying that
 *         he has infected 'The Beast' with a virus. Moreover, the note had the
 *         number N printed on it. After doing some calculations, Sherlock
 *         figured out that the key to remove the virus is the largest Decent
 *         Number having N digits.
 * 
 *         A Decent Number has the following properties:
 * 
 *         3, 5, or both as its digits. No other digit is allowed. Number of
 *         times 3 appears is divisible by 5. Number of times 5 appears is
 *         divisible by 3.
 * 
 *         Meanwhile, the counter to the destruction of 'The Beast' is running
 *         very fast. Can you save 'The Beast', and find the key before
 *         Sherlock?
 * 
 *         Input Format The 1st line will contain an integer T, the number of
 *         test cases. This is followed by T lines, each containing an integer
 *         N. i.e. the number of digits in the number.
 * 
 *         Output Format Largest Decent Number having N digits. If no such
 *         number exists, tell Sherlock that he is wrong and print −1.
 */
public class Sherlock_and_The_Beast {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		int times5=0,times3=0;
        int T=Integer.parseInt(br.readLine().trim());
        
        while(T-->0)
        {
            int len=Integer.parseInt(br.readLine().trim());
            StringBuilder ans=new StringBuilder();
            
            times3=5*(2*len%3);
            times5=len-times3;
            if(times5<0)
               out.println(-1);
            else
            {
                for(int i=0;i<times5;i++)
                    ans.append("5");
                for(int i=0;i<times3;i++)
                	ans.append("3");
               out.println(ans);

            }
        }
		
		out.close();
	}

}

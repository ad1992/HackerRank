package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Chief's bot is playing an old DOS-based game. There are N+1 buildings
 *         in the game - indexed from 0 to N and are placed left-to-right. It is
 *         guaranteed that building with index 0 will be of height 0 unit. For
 *         buildings with index i (i∈[1,N]) height will be hi units.
 * 
 *         At beginning Chief's bot is at building with index 0. At each step,
 *         bot jumps to next (right) building. Suppose bot is at kth building
 *         and his current energy is botEnergy, then in next step he will jump
 *         to (k+1)th building. He will gain/lose energy equal in amount to
 *         difference between hk+1 and botEnergy
 * 
 *         If hk+1>botEnergy, then he will lose hk+1−botEnergy units of energy.
 *         Otherwise, he will gain botEnergy−hk+1 units of energy.
 * 
 *         Goal is to reach Nth building, and during the course bot should never
 *         have negative energy units. What should be the minimum units of
 *         energy with which bot should start to successfully complete the game?
 * 
 *         Input Format
 * 
 *         The first line contains integer N. Next line contains N space
 *         separated integers h1,h2, ⋯,hN representing the heights of the
 *         buildings.
 * 
 *         Output Format
 * 
 *         Print a single number representing minimum units of energy required
 *         to complete the game.
 * 
 */
public class Chief_Hopper {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int N=Integer.parseInt(br.readLine().trim());
		s=br.readLine().trim();
		st=new StringTokenizer(s);
		int height[]=new int[N];
		for(int i=0;i<N;i++)
		{
			height[i]=Integer.parseInt(st.nextToken());
		}
		int min=0;
		for(int i=N-1;i>=0;i--)
		{
			min= (int) Math.ceil((double)(min+height[i])/2);
            System.out.println(min);
		}
		System.out.println(min);
	}

}

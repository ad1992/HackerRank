package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         You are given a square map of size n×n. Each cell of the map has a
 *         value denoting its depth. We will call a cell of the map a cavity if
 *         and only if this cell is not on the border of the map and each cell
 *         adjacent to it has strictly smaller depth. Two cells are adjacent if
 *         they have a common side (edge).
 * 
 *         You need to find all the cavities on the map and depict them with the
 *         uppercase character X.
 * 
 *         Input Format
 * 
 *         The first line contains an integer, n, denoting the size of the map.
 *         Each of the following n lines contains n positive digits without
 *         spaces. Each digit (1-9) denotes the depth of the appropriate area.
 * 
 *         Constraints 1≤n≤100
 * 
 *         Output Format
 * 
 *         Output n lines, denoting the resulting map. Each cavity should be
 *         replaced with character X
 * 
 */
public class Cavity_Map {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		int N=Integer.parseInt(br.readLine().trim());
		char arr[][]=new char[N][N];
		int i=0;
        while(i<N)
        {
        	if((s=br.readLine().trim())!=null)
			{
        		    
        		for(int j=0;j<N;j++)
        		{
        			arr[i][j]=s.charAt(j);
                  
        			
        		}
        		i++;
			}
        }
        for(i=0;i<N;i++)
        {
        	for(int j=0;j<N;j++)
        	{
        		if(i==0||j==0|i==N-1|j==N-1)
        		{
        			System.out.print(arr[i][j]);
        		}
        		else
        		{
        			if(arr[i][j]>arr[i][j-1]&&arr[i][j]>arr[i][j+1]&&arr[i][j]>arr[i-1][j]&&arr[i][j]>arr[i+1][j])
        			{
        				System.out.print('X');
        			}
        			else
        			{
        				System.out.print(arr[i][j]);
        			}
        		}
        	}
        	System.out.println();
        }

	}

}

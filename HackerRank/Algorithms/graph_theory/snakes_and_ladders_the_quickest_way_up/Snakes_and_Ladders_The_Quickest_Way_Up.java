package graph_theory.snakes_and_ladders_the_quickest_way_up;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 *
 */
public class Snakes_and_Ladders_The_Quickest_Way_Up {
private static boolean[] visited;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int ladders=Integer.parseInt(br.readLine().trim());
			int dest[]=new int[101];
			visited=new boolean[101];
			for(int i=1;i<=100;i++)
				dest[i]=i;
			String s;
			StringTokenizer st;
			while(ladders-->0)
			{
				s=br.readLine();
				st=new StringTokenizer(s);
				int start=Integer.parseInt(st.nextToken());
				int end=Integer.parseInt(st.nextToken());
				dest[start]=end;
			}
			int snakes=Integer.parseInt(br.readLine().trim());
			while(snakes-->0)
			{
				s=br.readLine();
				st=new StringTokenizer(s);
				int start=Integer.parseInt(st.nextToken());
				int end=Integer.parseInt(st.nextToken());
				dest[start]=end;
			}
			int dice_throws=bfs(dest);
			System.out.println(dice_throws);
		}
		
	}

	private static int bfs(int[] dest) {
		int steps=-1;
		Queue<Node> queue=new LinkedList<>();
		queue.add(new Node(1,0));
		Node ele=null;;
		while(!queue.isEmpty())
		{
			ele=queue.poll();
			visited[ele.v]=true;	
			if(ele.v==100)
				return ele.dist;
			for(int i=ele.v+1;i<=ele.v+6&&i<=100;i++)
			{
				
				
				if(!visited[i]){
					Node n=new Node(dest[i],ele.dist+1);
					queue.add(n);					
					visited[i]=true;
					
				}
				
			}
			
			
			
		}
		return steps;
	}
	private static class Node
	{
		int v;
		int dist;
		Node(int v1,int d)
		{
			v=v1;
			dist=d;
		}
	}
}


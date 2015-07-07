package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         For an upcoming programming contest, Roy is forming some teams from
 *         the n students of his university. A team can have any number of
 *         contestants.
 * 
 *         Roy knows the skill level of each contestant. To make the teams work
 *         as a unit, he should ensure that there is no skill gap between the
 *         contestants of the same team. In other words, if the skill level of a
 *         contestant is x, then he has either the lowest skill level in his
 *         team or there exists another contestant with skill level of x−1 in
 *         the same team. Also, no two contestants of the same team should have
 *         same skill level. Note that a contestant can write buggy code and
 *         thus can have a negative skill level.
 * 
 *         The more contestants on the team, the more problems they can attempt
 *         at a time. So, Roy wants to form teams such that the smallest team is
 *         as large as possible.
 * 
 *         Input Format
 * 
 *         The first line of input contains t (1≤t≤100), the number of test
 *         cases.
 * 
 *         Each case contains an integer n (0≤n≤105), the number of contestants,
 *         followed by n space separated integers. The ith integer denotes the
 *         skill level of ith contestant. The absolute values of skill levels
 *         will not exceed 109.
 * 
 *         The total number of contestants in all cases will not exceed 106.
 * 
 *         Output Format
 * 
 *         For each test case, print the size of smallest team in a separate
 *         line.
 * 
 */
public class Team_Formation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		StringTokenizer st;
		int T=Integer.parseInt(br.readLine().trim());
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				st=new StringTokenizer(s);
				int N=Integer.parseInt(st.nextToken());
                if(N>0){
				long arr[]=new long[N];
				LinkedList<Integer> list=new LinkedList<>();
				Hashtable<Long, LinkedList<Integer>> hash=new Hashtable<>();
				for(int i=0;i<N;i++)
				{
					long num=Long.parseLong(st.nextToken());
					arr[i]=num;
				}
				Arrays.sort(arr);
				int count[]=new int[N];
				count[0]=1;
				int c=1;
				list.add(0);
				hash.put(arr[0],list);
				//System.out.println(hash.get(arr[0]));
				for(int i=1;i<N;i++)
				{
					
						//System.out.println(hash.get(arr[i]-1)+" "+(arr[i]-1));
						LinkedList<Integer> list1;
						if(hash.get(arr[i]-1)!=null&&!hash.get(arr[i]-1).isEmpty())
						{
							int pos=hash.get(arr[i]-1).getFirst();							
							count[pos]++;	
							list1=hash.get(arr[i]-1);
							list1.removeFirst();
							hash.put(arr[i]-1, list1);
							if((hash.get(arr[i])!=null)&&!hash.get(arr[i]).isEmpty())
							{
								int c1=hash.get(arr[i]).getFirst();
								list1=hash.get(arr[i]);
								if(count[c1]>=count[pos])
								{
									
									list1.addFirst(pos);
									
								}
								else
								{
									list1.add(pos);
									
								}
							}
							else
							{
								
								list1=new LinkedList<>();
								list1.add(pos);
								
							}
									
							
									
						}
						else
						{	
							count[c]=1;
							list1=hash.get(arr[i]);
							if(list1==null)
							{
								list1=new LinkedList<>();
								list1.add(c);
								
							}
							else
							{							
								list1.addFirst(c);							

							}
                         
							c++;
						}
                    	hash.put(arr[i], list1);
					
				}
                int min=Integer.MAX_VALUE;
				for(int i=0;i<c;i++)
				{
					if(min>count[i])
                        min=count[i];
				}
           
				System.out.println(min);	
                }
                else{
                    System.out.println(0);	
                }
				T--;
			}
		}

	}

}

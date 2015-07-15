package sorting;


import java.util.Scanner;

/**
 * @author Aakansha Doshi
 * 
 * 
 *         You're given an array ar and a number p. Partition the array, so that
 *         all elements greater than p are to its right, and all elements
 *         smaller than p are to its left. p is called the pivot of the
 *         partition.
 * 
 *         Guideline - In this challenge, you do not need to move around the
 *         numbers 'in-place'. This means you can create two lists and combine
 *         them at the end.
 * 
 *         Input Format You will be given an array of integers. The number p is
 *         the first element in ar.
 * 
 *         There are two lines of input:
 * 
 *         n - the number of elements in the array ar the n elements of ar
 *         (including p at the beginning)
 * 
 *         Output Format Print out the numbers of the partitioned array on one
 *         line.
 */
public class QuickSort_1_Partition {
    
    static void partition(int[] ar) {
    	String less="",grt="";
    	for(int i=1;i<ar.length;i++)
    	{
    		if(ar[i]>ar[0])
    		{
    			grt+=ar[i]+" ";
    		}
    		else
    		{
    			less+=ar[i]+" ";
    		}
    	}
    	System.out.println(less+ar[0]+" "+grt);
              
 }   


 
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int[] ar = new int[n];
     for(int i=0;i<n;i++){
        ar[i]=in.nextInt(); 
     }
     partition(ar);
     in.close();
 }    
}

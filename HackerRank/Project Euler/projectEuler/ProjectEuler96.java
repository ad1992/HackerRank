package projectEuler;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler96 {
int row;
int col;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[][]=new int[9][9];		
		String s;		
	
		for(int i=0;i<9;i++)
		{
			
			if((s=br.readLine().trim())!=null)
			{
				
				for(int j=0;j<9;j++)
				{
					arr[i][j]=s.charAt(j)-48;
				}
			}
		}
		
		SolveSudoku(arr);	
		printsudoku(arr);
		
		
	}

	private static void printsudoku(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	private static boolean SolveSudoku(int[][] arr) {
		// TODO Auto-generated method stub
		ProjectEuler96 ob=new ProjectEuler96();
		if(!FindUnassignedLocation(arr,ob))
			return true;
		
		for(int num=1;num<=9;num++)
		{
			if(isSafe(arr,num,ob.row,ob.col))
			{
				//System.out.println("safe"+num);
				arr[ob.row][ob.col]=num;
				if(SolveSudoku(arr))
					return true;
				arr[ob.row][ob.col]=0;
			}
			
			
		}
		//printsudoku(arr);
		//System.out.println();
		return false;
	}

	private static boolean isSafe(int[][] arr,int num,int row,int col) {
		// TODO Auto-generated method stub
		if(checkGrid(arr,num,row,col)&&checkRowandCol(arr, num,row,col))
		{
			return true;
		}
		return false;		
	}
	private static boolean checkRowandCol(int[][] arr,int num,int row,int col)
	{
		for(int i=0;i<9;i++)
		{
			//System.out.println(row+" "+col);
			if(arr[row][i]==num||arr[i][col]==num)
			{
				return false;
			}
			
		}
		return true;
	}
	private static boolean checkGrid(int[][] arr,int num,int row,int col)
	{
		int startrow=row-row%3;
		int startcol=col-col%3;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(arr[i+startrow][j+startcol]==num)
				{
					return false;
				}
			}
		}
		return true;
	}
	private static boolean FindUnassignedLocation(int[][] arr,ProjectEuler96 ob) {
		// TODO Auto-generated method stub
		for(ob.row=0;ob.row<9;ob.row++)
		{
			for(ob. col=0;ob.col<9;ob.col++)
			{
				if(arr[ob.row][ob.col]==0)
				{
					//System.out.println("row="+row+"col="+col);
					return true;
				}
					
			}
		}
		
		return false;
	}

}

package projectEuler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler19{
static 	int month[]={31,28,31,30,31,30,31,31,30,31,30,31};
static int   sundayin400years=688;//very important as this pattern will be repeated after every 400 years
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int days=0;
		/*for(int i=1900;i<2000;i++)
		{
			days+=daysinayear(i);
		}*/
		//System.out.println(days);int day=0;
		/*long sunday=0l;day=5;//saturday given;
		for(int i=2000;i<2400;i++)
		{
			for(int j=0;j<12;j++)
			{
				day=(day+month[j])%7;
				if(j==1&&checkleapYear(i))
					day++;
				if(day==6)
					sunday++;
				
			}
			
		}*/
		//System.out.println(sunday);//go 688;		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine().trim());
		String s;	
		while(T>0)
		{
			if((s=br.readLine().trim())!=null)
			{
				
				String start[]=s.split(" ");
				if((s=br.readLine().trim())!=null)
				{
					String end[]=s.split(" ");
					
					int d1=Integer.parseInt(start[2]);
					int m1=Integer.parseInt(start[1]);
					long y1=Long.parseLong(start[0]);
					int d2=Integer.parseInt(end[2]);
					int m2=Integer.parseInt(end[1]);
					long y2=Long.parseLong(end[0]);
					//decrementing the starting date by 1
					d1--;
					if(d1==0)
					{
						m1--;
						if(m1==0)
						{
							m1=12;
							y1--;
						}
					}
					long ans=solve(y2,m2)-solve(y1,m1);
				    System.out.println(ans);
                    T--;
				}
			}
		}	
	}


	private static long solve(long y, int m) {
		// TODO Auto-generated method stub
		//calculating from 1st jan 1900 to 2000
		int  day=0;//considering monday;
		long year=1900;
		long sunday=0l;
        m-=1;
		if(y>2000)
		{
			year=1900;
			while(year<2000)
			{
				for(int j=0;j<12;j++)
				{
					if(day==6)
						sunday++;
                    day+=month[j];
					if(j==1&&checkleapYear(year))
						day++;
                    day=day%7;
					
                    //System.out.println(day);
					
				}
				year++;
			}
		
       // System.out.println("sunday untill 2000 "+sunday);
		long leapyearcentury=(y-2000)/400;
		sunday+=leapyearcentury*sundayin400years;
       // System.out.println("sunday untill leapyear "+sunday);
		year+=leapyearcentury;
        }
		//calculating till current year
		while(year<y)
		{
			for(int j=0;j<12;j++)
			{
				if(day==6)
						sunday++;
                    day+=month[j];
					if(j==1&&checkleapYear(year))
						day++;
                    day=day%7;
				
				
			}
			year++;
		}
		//calculating till current month
		int m1=0;
		while(m1<=m)
		{
			if(day==6)
				sunday++;
             day+=month[m1];
			if(m1==1&&checkleapYear(year))
				day++;
               day=day%7;
			m1++;
		}
		
		return sunday;
	}


	static boolean checkleapYear(long year)
	{
		return ((year%100!=0&&year%4==0)||(year%400==0));
	}
	static int daysinayear(long year)
	{
		if(checkleapYear(year))
			return 366;
		else return 365;
	}
	
}

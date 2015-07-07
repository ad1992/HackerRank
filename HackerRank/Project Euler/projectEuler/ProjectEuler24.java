package projectEuler;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Aakansha Doshi
 *
 */
public class ProjectEuler24 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));	
		//String s1=br.readLine();
       String s1="abcdefghijklm";
            
		int T=Integer.parseInt(br.readLine().trim());
	
		int fact[]=new int[s1.length()-1];int j=2;fact[fact.length-1]=1;
		for(int i1=fact.length-2;i1>=0;i1--)
		{
			fact[i1]=fact[i1+1]*j;
			j++;
		}
		//System.out.println(fact.length);
	//	String s;
		while(T-->0)
		{
			long N=Long.parseLong(br.readLine().trim());int div;
			StringBuffer s=new StringBuffer(s1);
			int i=0;String ans="";double a;
			while(N>1)
			{
				//System.out.println(i);
				if(N>fact[i]){
				 a=(double)N/fact[i];
				}
				else
				{
					 a=0.5;
					 
				}
				//System.out.println(s);
				//System.out.println(a);
				div=(int)Math.floor(a);				
				N=N-div*fact[i];
				int ind=(int) Math.ceil(a)-1;
				ans+=s.charAt(ind);				
				s.deleteCharAt(ind);
				i++;	
				//System.out.println(a+" "+ind+" " +N);				
				 if(N==0&&s.length()>1){
					s.reverse();
				}
				
				// System.out.println(i);
			}
			//System.out.println(s.charAt(1));
			ans+=s;	
			System.out.println(ans);
		

	}

}
}
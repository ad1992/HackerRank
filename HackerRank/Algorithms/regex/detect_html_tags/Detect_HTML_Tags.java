package regex.detect_html_tags;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detect_HTML_Tags {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		int N=Integer.parseInt(br.readLine().trim());
		String s="";
		
		for(int i=0;i<N;i++)
		{
			s+=br.readLine().trim();
			
		}
		TreeSet<String> tree=count_html_tags(s);
        int i=0;
        String s1="";
		for(String t:tree){
			s1=t;
            if(i==tree.size()-1)
                break;
			System.out.print(t+";");
            i++;
        }
        System.out.print(s1);
	}

	private static TreeSet<String> count_html_tags(String s) {
		String pat="\\s*(?:<([a-z][a-z0-9]*)|([\\[]))\\s*";
		Pattern p=Pattern.compile(pat);		
		Matcher m=p.matcher(s);
		TreeSet<String> set=new TreeSet<>();
		while(m.find())
		{
			String tag=m.group(0).trim();
			//System.out.println(tag);
			if(tag.equals("["))
				set.add("a");
			else
				set.add(m.group(1));			
			
		}
		return set;
		
	}
}



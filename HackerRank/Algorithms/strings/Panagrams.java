package strings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Panagrams {

    public static void main(String[] args)throws NumberFormatException, IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        boolean arr[]=new boolean[91];
        s=s.toUpperCase();int c=0;
        for(int i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(!arr[ch]&& ch>=65&&ch<=90){
                arr[ch]=true;
                c++;
            }
        }
        if(c==26)
            
            System.out.println("pangram");
        else
              System.out.println("not pangram");
    }
}
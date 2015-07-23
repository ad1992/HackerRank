package regex.valid_pan_format;
import java.io.*;
import java.util.regex.*;

/**
 * @author Aakansha Doshi
 *
 */
public class Valid_PAN_format {
   
  
    // Template Credit goes to www.hackerrank.com/kogupta 
    private static boolean isValidPAN(String s) {
         String pat="^[A-Z]{5}[0-9]{4}[A-Z]{1}$";
         Pattern r = Pattern.compile(pat);
         // Now create matcher object.
         Matcher m = r.matcher(s);
         return m.find();
    }
  
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                String s = br.readLine();
                System.out.println(isValidPAN(s) ? "YES" : "NO");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}

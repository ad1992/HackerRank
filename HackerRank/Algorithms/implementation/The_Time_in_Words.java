import java.util.Scanner;
/**
 * @author Aakansha Doshi
 * 
 *         Problem Statement
 * 
 *         Given the time in numerals we may convert it into words, as shown
 *         below:
 *         
 * 			5:00->five o' clock
 *         	5:01->one minute past five
 * 
 *         Write a program which prints the time in words for the input given in
 *         the format mentioned above.
 * 
 *         Input Format
 * 
 *         There will be two lines of input: H, representing the hours M,
 *         representing the minutes
 * 
 *         Constraints 1≤H≤12 0≤M<60
 * 
 *         Output Format
 * 
 *         Display the time in words.
 */

public class Solution {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int h = in .nextInt();
    int m = in .nextInt();
    String word[] = {
      "",
      "one",
      "two",
      "three",
      "four",
      "five",
      "six",
      "seven",
      "eight",
      "nine",
      "ten",
      "eleven",
      "twelve",
      "thirteen",
      "fourteen",
      "fifteen",
      "sixteen",
      "seventeen",
      "eighteen",
      "nineteen",
      "twenty",
      "twenty one",
      "twenty two",
      "twenty three",
      "twenty four",
      "twenty five",
      "twenty six",
      "twenty seven",
      "twenty eight",
      "twenty nine"
    };
    String time = "";

    if (m == 0) {
      time = word[h] + " o' clock";
    } else if (m == 15) {
      time = "quarter past " + word[h];
    } else if (m == 30) {
      time = "half past " + word[h];
    } else if (m == 45) {
      time = "quarter to " + word[h + 1];
    } else if (m == 1) {
      time = word[m] + " minute past " + word[h];
    } else if (m < 30) {
      time = word[m] + " minutes past " + word[h];
    } else {
      time = word[60 - m] + " minutes to " + word[h + 1];
    }
    System.out.println(time);
  }
}

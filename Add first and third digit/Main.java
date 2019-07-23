import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner scr=new Scanner(System.in);
	  int n=scr.nextInt();
      int l=n%10;
      int f=n/100;
      int s=f+l;
      System.out.println(s);
    }
}
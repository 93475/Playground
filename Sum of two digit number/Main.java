import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int f=n/10;
      int l=n%10;
      int r=f+l;
      System.out.println(r);
	}
}
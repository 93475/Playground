import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner s=new Scanner(System.in);  
      // Type your code here
      int n=s.nextInt();
      int l=n%10;
      while(n>=10)
      {
        n=n/10;
      }
      int f=n;
      int r=f+l;
      System.out.println(r);
	}
}
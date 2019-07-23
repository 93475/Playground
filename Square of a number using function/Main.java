import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a=sqr(n);
      System.out.println(a);
	} 
  public static int sqr(int n1)
  {
    int res=n1*n1;
    return res;
  }
}
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    int r=0;
    while(n1!=0)
    {
    int m=n1%10;
    r=r*10+m;
    n1=n1/10;
    }
		System.out.print(r);
		
  }
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int res=gre(n1,n2);
      System.out.println(gre(res,n3));
	}
  public static int gre(int num1,int num2)
  {
    int r;
    if(num1 > num2)
    {
      r=num1;
    }
    else
    {
      r=num2;
    }
    return r;
  }
}
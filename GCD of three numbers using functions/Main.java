import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int r=gcd(n1,n2);
      System.out.println(gcd(r,n3));
	}
  public static int gcd(int num1,int num2)
  {
    int min;
    if(num1<num2)
    {
     min=num1; 
    }
    else
    {
      min=num2;
    }
    while(min>=1){
    if((num1%min==0)&&(num2%min)==0)
    {
      return min;
    }
      --min;
    }
    return 0;
  }
}
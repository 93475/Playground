import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int b=s.nextInt();
      int e=s.nextInt();
      int mul=1;
      for(int i=1;i<=e;i++)
      {
        mul=mul*b;
      }
      System.out.print(mul);
    }
}
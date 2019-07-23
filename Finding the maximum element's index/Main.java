import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i,max,ind=0;
    int[] a=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    max=a[0];
    for(i=0;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
        ind=i;
        //break;
      }
    }
    System.out.println(ind);
  }
}
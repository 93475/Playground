import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    per(a,n);
  }
  public static void per(int ar[],int n1)
  {
    boolean b=true;
    int s1=ar[0]+ar[1]+ar[2];
    for(int i=3;i<n1;i=i+3)
    {
      int s2=ar[i]+ar[i+1]+ar[i+2];
 	  if(s2 != s1)
      {
       b=false; 
      }
    }
    if(b==true)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }
}
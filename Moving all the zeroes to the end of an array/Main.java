import java.util.Scanner;
class Main{
  	public static void seg(int n,int a[])
    {
      int[] an=new int[n];
      int c=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]!=0)
        {
          int temp=a[i];
          a[i]=a[c];
          a[c]=temp;
          c++;
        }
      }
    }
    public static void main(String args[]) {
       // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      seg(n,a);
      for(int i=0;i<n;i++)
      {
        System.out.print(a[i] + " ");
      }
    }
}
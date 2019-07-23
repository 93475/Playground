import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int[] a=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int max=a[0];
      for(i=0;i<n;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
        }
      }
      System.out.println(max);
    }
}
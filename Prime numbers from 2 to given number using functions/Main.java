import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      pr(n);
      //System.out.println(res);
	}
  public static void pr(int num)
  {
    for(int i=2;i<=num;i++)
    {
      int c=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j==0)
        {
          c++;
        }
      }
      if(c==2)
      {
        System.out.println(i);
      }
    }
  }
}

/*for(i=2;i<=n;i++)
    {
        int c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
         
       if(c==2)
        {
            printf("%d ",i);
        }
    }*/
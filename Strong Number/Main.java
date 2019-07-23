import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      /*int n=s.nextInt();
      int fact=1;
      int sum=0;
      int n2=n;
      while(n2>0)
      {
        int n1=n%10;
        for(int i=n1;i>0;i--)
        {
          fact=fact*i;
        }
        sum+=fact;
        n1=n1/10;
        n2=n2/10;
      }
      if(sum==n)
      {
      System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }*/
      int Number, Temp, Reminder, Sum = 0, i, Factorial;
      		Number = s.nextInt();		
      Temp = Number;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    //System.out.println(Reminder + "  =  " + Factorial);
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
      if(Sum==Number)
      System.out.println("Yes");
      else
        System.out.println("No");
	}
}
import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      
        for(int j=1;j<2*n;j++)
        {
          if(j%2==1)
          {
            System.out.println(j);
          }
        }
      
	}
}
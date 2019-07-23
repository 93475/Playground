import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int l=str.length();
      boolean ispal=true;
      int front=0;
      int end=l-1;
      while(front<end)
      {
        if(str.charAt(front)!=str.charAt(end))
        {
          ispal=false;
          break;
        }
        front++;
        end--;
      }
      if(ispal==true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    } 
}
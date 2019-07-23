import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner s=new Scanner(System.in);
      char c=s.next().charAt(0);
      int key=s.nextInt();
      if(c>='a' && c<='z')
      {
        c=(char)(c-key);
        if(c<'a')
        {
          c=(char)(c+26);
        }
      }
      else if(c>='A' && c<='Z')
      {
        c=(char)(c-key);
        if(c<'A')
        {
          c=(char)(c+26);
        }
      }
      System.out.println(c);
    }
}

/*
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // Get the input
        char ch = in . next().charAt(0);
        int key = in.nextInt();
        // Subtract the key value from the given character and store it in a variable "ch"
        // If it is less than 'a' or 'A', then add it with 26.
        // Otherwise print "ch"
        if(ch >= 'a' && ch <= 'z'){
            ch = (char)(ch - key);
            if(ch < 'a'){
                ch = (char)(ch + 26);
            }
        }
        else if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch - key);
            if(ch < 'A'){
                ch = (char)(ch + 26);
            }
        }
        System.out.print(ch);
    }
}*/
import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      StringBuilder sb=new StringBuilder(s1);
      int[] f=new int[26];
      for(int i=0;i<26;i++)
      {
        f[i]=0;
      }
      for(int i=0;i<sb.length();i++)
      {
        if(sb.charAt(i)>='A' && sb.charAt(i)<='Z')
        {
          f[sb.charAt(i)-'A']++;
        }
        if(sb.charAt(i)>='a' && sb.charAt(i)<='z')
        {
          f[sb.charAt(i)-'a']++;
        }
      }
      for(int i=0;i<=25;i++)
      {
        if(f[i]==0)
        {
          char ch=(char)(i + 'a');
          System.out.print(ch + " ");
        }
      }
    }
}
/*import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int pw=s.nextInt();
    int bs=s.nextInt();
    int res=pwr(bs,pw);
    System.out.println(res);
  }
  public static int pwr(int b,int p)
  {
    int power=1;
    while(p>=1)
    {
      power=power*b;
      p--;
    }
    return power;
  }
}*/


import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    int exponent = in.nextInt();
	    System.out.print(power_of_a_number(base, exponent));// function call
	}
    // Function to find the power of a number
	public static int power_of_a_number(int base, int exponent)
	{
	    int power = 1;
	    while(exponent >= 1)
	    {
	        power = power * base;
	        exponent--;
	    }
	    return power;
	}
}// End of Main class

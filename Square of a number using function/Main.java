import java.util.Scanner;
class Main
{
    public static int square(int n)
    {
      int sqr=n*n;
      return sqr;
    }
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(square(n));
    }
} 

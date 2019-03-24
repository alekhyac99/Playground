import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int max;
      if(n3>sec(n1,n2))
        max=n3;
      else
        max=sec(n1,n2);
      System.out.println(max);
	}
  public static int sec(int n1, int n2)
  {
    int sec;
    if(n1>n2)
      sec=n1;
    else
      sec=n2;
    return sec;
  }
}
import java.util.Scanner;
class Main{
  public static int sum1( int n)
  {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int num=0,b=0;
      while(num<=n)
      {
        int sod=sum1(n);
        b=sod;
        num++;
	 }
      System.out.println(b);
}
}
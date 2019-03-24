import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    System.out.println(expo(n,m));
  }
  public static int expo(int n,int m)
  {
    int exp=1;
    while(m!=0)
    {
      exp=exp*n;
      --m;
    }
    return exp;
  }
}
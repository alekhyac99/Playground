import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int sum1=0,sum2=0,i;
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=in.nextInt();
    }
    for(i=0;i<=n/2;i++)
    {
      sum1=sum1+a[i];
    }
    for(i=n/2;i<n;i++)
    {
      sum2=sum2+a[i];
    }
    if(sum1==sum2)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
     
  }
}
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
         a[i]=in.nextInt();
      }
      int n1=in.nextInt();
      int n2=in.nextInt();
      int flag1=0,flag2=0,m=0,m1=0;
      for(int i=0;i<n;i++)
      {
        if(n1==a[i])
        {
          m=i;
          flag1=1;
          break;
        }
        else
          flag1=0;
      }
      if(flag1==1)
        System.out.println(m);
      else 
        System.out.println("-1");
      for(int i=0;i<n;i++)
      {
        if(n2==a[i])
        {
           m1=i;
          flag2=1;
          break;
        }
        else 
          flag2=0;
      }
        if(flag2==1)
        System.out.println(m1);
      else 
        System.out.println("-1");
    }
}
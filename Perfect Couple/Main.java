import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=0;
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int c=in.nextInt();
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
            if(a[i]<=c)
            {
            sum=a[i]+a[j];
            if(sum==c)
              System.out.print(a[i]+", "+a[j]+"\n");
            }
        }
      }
    }
}        
   
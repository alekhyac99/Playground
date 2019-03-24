import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int m,k=0;
      if(n3>gcd(n1,n2))
         m=gcd(n1,n2);
      else
         m=n3;
      while(m>=1)
         {
           if(n3%m==0&&gcd(n1,n2)%m==0)
           {
             k=m;
             break;
           }
           m--;
         }
         System.out.println(k);
	}
    public static int gcd(int n1,int n2)
    {
      int min,gcd=0;
      if(n1<n2)
        min=n2;
      else 
        min=n1;
      while(min>=1)
      {
        if(n1%min==0&&n2%min==0)
        {
          gcd=min;
          break;
        }
        min--;
      }
      return gcd;
    }
}
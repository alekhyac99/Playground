import java.util.*;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
     p(n);
      
	}
  public static boolean prime(int n)
  {
    for(int i=2;i<n;i++)
      if(n%i==0)
        return false;
     return true;
    }
  public static int p(int n)
  {
    for(int i=2;i<n;i++)
      if(prime(i))
        System.out.println(i);
    return 1;
  }
    
}
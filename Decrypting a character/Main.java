import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int key=in.nextInt();
      char sum=(char)(ch-key);
      if(sum>='a'&&sum<='z'||sum>='A'&&sum<='Z')
      {
      System.out.println(sum);
      }
      else
        System.out.println("z");
    }
}
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long n = sc.nextInt();
            long s = sc.nextInt();
            
            if(s%n <= b && a*n+b >= s)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if(n == a && n == b)
                System.out.println("YES");
            else if(n == a || n == b)
                System.out.println("NO");
            else if(n-a-b >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
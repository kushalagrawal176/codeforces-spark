import java.util.*;
public class main
{
    public static boolean solve(int a, int b, int m)
    {
        if(a == m || b == m)
            return true;
        if(a%3!=0 && b%3!=0)
            return false;
        
        if(a%3 == 0)
        {
            if(solve(a/3, 2*(a/3), m))
                return true;
        }
        
        if(b%3 == 0)
        {
            if(solve(b/3, 2*(b/3), m))
                return true;
        }
        
        return false;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if(n == m)
                System.out.println("YES");
            else if(n%3 != 0)
                System.out.println("NO");
            else
            {
                int a = n/3;
            
                if(solve(a, 2*a, m))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
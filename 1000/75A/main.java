import java.util.*;
public class main
{
    public static int removeZero(int n)
    {
        int d = 0;
        int t = 1;
 
        while(n > 0)
        {
            int r = n%10;
            n /= 10;
 
            if(r > 0)
            {
                d += t*r;
                t *= 10;
            }
        }
 
        return d;
    }
 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = a+b;
        
        a = removeZero(a);
        b = removeZero(b);
        c = removeZero(c);
        
        System.out.println((a+b == c) ? "YES" : "NO");
    }
}
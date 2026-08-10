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
            int cnt = 0;
            
            while(n >= 10)
            {
                cnt += (10*(n/10));
                n = n%10 + n/10;
            }
            
            System.out.println(cnt+n);
        }
    }
}
import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long m = sc.nextLong();
 
            System.out.println(solve(m)-solve(n-1));
        }
    }
    
    public static long solve(long n)
    {
        return (n-n/2-n/3-n/5-n/7+n/6+n/15+n/10+n/14+n/21+n/35-n/70-n/42-n/30-n/105+n/210);
    }
}
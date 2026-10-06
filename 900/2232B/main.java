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
            long a = 0;
            long sol = Long.MAX_VALUE;
 
            for(int i=1;i<=n;i++)
            {
                long x = sc.nextLong();
                a += x;
 
                long cur = a/i;
                sol = Math.min(sol,cur);
 
                System.out.print(sol+" ");
            }
 
            System.out.println();
        }
    }
}
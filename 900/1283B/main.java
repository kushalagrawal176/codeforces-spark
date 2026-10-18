import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) 
        {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long ans = (n/k)*k + Math.min(n%k, k/2);
            System.out.println(ans);
        }
    }
}
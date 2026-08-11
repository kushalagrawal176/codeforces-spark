import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            long f = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            long sum = 0;

            long A[] = new long[n+1];
            for(int i=1;i<=n;i++)
            {
                A[i] = sc.nextLong();
                sum += Math.min((A[i]-A[i-1])*a, b);
            }

            System.out.println(sum>=f?"NO":"YES");
        }
    }
}
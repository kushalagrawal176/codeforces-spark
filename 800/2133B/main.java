import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int j=0;j<t;j++)
        {
            int n = sc.nextInt();
            long a[] = new long[n];

            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();

            Arrays.sort(a);

            long ans = 0;
            int s = (n%2==1) ? 0:1;

            for(int i=s;i<n;i+=2)
                ans += a[i];

            System.out.println(ans);
        }
    }
}
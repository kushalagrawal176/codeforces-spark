import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            long sum = 0, mx = 0;
            int cnt = 0;

            long[] a = new long[n + 1];  // 1-based indexing like in C++

            for (int i = 1; i <= n; i++) 
            {
                a[i] = sc.nextLong();
                sum += a[i];
                mx = Math.max(mx, a[i]);

                if (mx * 2 == sum) 
                    cnt++;
            }

            System.out.println(cnt);
        }
    }
}

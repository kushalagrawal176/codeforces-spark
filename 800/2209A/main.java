import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            Arrays.sort(a);

            for (int i = 0; i < n; i++) 
            {
                if (a[i] <= c) 
                {
                    if (k > 0) 
                    {
                        long mini = c - a[i];
                        long add = Math.min(k, mini);
                        c += a[i] + add;
                        k -= add;
                    } 
                    else
                        c += a[i];
                }
            }

            System.out.println(c);
        }
    }
}

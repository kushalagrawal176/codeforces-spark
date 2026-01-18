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
            int m = sc.nextInt();

            // Precomputed Fibonacci sequence up to 10th term
            int[] a = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

            StringBuilder ans = new StringBuilder();
            while (m-- > 0) 
            {
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();

                if (n == 1)
                    ans.append("1");
                else if (Math.min(b, Math.min(c, d)) >= a[n - 1]) 
                {
                    if (a[n - 1] + a[n - 2] <= Math.max(b, Math.max(c, d)))
                        ans.append("1");
                    else
                        ans.append("0");
                } 
                else
                    ans.append("0");
            }

            System.out.println(ans.toString());
        }
    }
}

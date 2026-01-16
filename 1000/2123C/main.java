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
            int[] a = new int[n];
            int[] mini = new int[n];
            int[] maxi = new int[n];

            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
                mini[i] = Integer.MAX_VALUE;
                maxi[i] = -1;
            }

            int m = a[0];
            for (int i = 1; i < n; i++) 
            {
                mini[i] = m;
                m = Math.min(m, a[i]);
            }

            m = a[n - 1];
            for (int i = n - 2; i >= 0; i--) 
            {
                maxi[i] = m;
                m = Math.max(m, a[i]);
            }

            mini[0] = -1;
            maxi[n - 1] = -1;

            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) 
            {
                if (mini[i] == -1 || maxi[i] == -1)
                    ans.append("1");
                else if (mini[i] <= a[i] && maxi[i] >= a[i])
                    ans.append("0");
                else
                    ans.append("1");
            }

            System.out.println(ans.toString());
        }
    }
}

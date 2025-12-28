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
            int s = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            if (n == 1) 
                System.out.println(Math.abs(s - a[0]));
            else if (s <= a[0])
                System.out.println(Math.abs(a[n - 1] - s));
            else if (s >= a[n - 1])
                System.out.println(Math.abs(s - a[0]));
            else 
            {
                int left = s - a[0];
                int right = a[n - 1] - s;
                System.out.println(Math.min(left, right) * 2 + Math.max(left, right));
            }
        }
    }
}

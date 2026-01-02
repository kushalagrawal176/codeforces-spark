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
            int one = 0;

            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
                if (a[i] == 1)
                    one++;
            }

            boolean flag = true;
            for (int i = 0; i < n - 1; i++) 
            {
                if (a[i] == a[i + 1] && a[i] == 0) 
                {
                    flag = false;
                    break; // no need to continue further
                }
            }

            if (one == n)
                flag = false;

            if (flag)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}

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
            int j = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int num = a[j - 1];
            int max_remove = 0;
            int to_remove = n - k;

            Arrays.sort(a);

            for (int i = 0; i < n; i++) 
            {
                if (a[i] == num) 
                {
                    max_remove = i + (n - i - 1) - 1;
                    if (num == a[n - 1])
                        max_remove++;
                    
                    break;
                }
            }

            if (max_remove < to_remove)
                System.out.println("NO");
            else 
                System.out.println("YES");
        }
    }
}

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
            long[] a = new long[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            for (int i = 0; i < n; i++) 
            {
                int maxi = 0;
                int mini = 0;

                for (int j = i + 1; j < n; j++) 
                {
                    if (a[j] > a[i])
                        maxi++;

                    if (a[j] < a[i])
                        mini++;
                }

                System.out.print(Math.max(mini, maxi) + " ");
            }

            System.out.println();
        }
    }
}

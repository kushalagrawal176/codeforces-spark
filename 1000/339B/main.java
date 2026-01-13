import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of houses
        int m = sc.nextInt();  // number of tasks

        long time = 0;
        int[] a = new int[m];

        for (int i = 0; i < m; i++)
            a[i] = sc.nextInt();

        // Initial move to the first task
        time += a[0];

        // Process subsequent tasks
        for (int i = 1; i < m; i++) 
        {
            if (a[i] >= a[i - 1])
                time += a[i] - a[i - 1];
            else
                time += n - (a[i - 1] - a[i]);
        }

        System.out.println(time - 1);
    }
}

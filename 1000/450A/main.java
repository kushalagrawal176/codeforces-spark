import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int maxi = Integer.MIN_VALUE;
        int pos = -1;

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();

            int cnt = a[i] / m;
            if (a[i] % m != 0)
                cnt++;

            if (maxi <= cnt) 
            {
                maxi = cnt;
                pos = i + 1; // 1-based index
            }
        }

        System.out.println(pos);
    }
}

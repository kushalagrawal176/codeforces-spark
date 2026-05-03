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
            int z = 0, p = -1;

            int s = n * (n + 1) / 2;
            int[] v = new int[n];

            for (int i = 0; i < n; i++) 
            {
                v[i] = sc.nextInt();
                s -= v[i];

                if (v[i] == 0) 
                {
                    z++;
                    p = i;
                }
            }

            if (z == 1)
                v[p] = s;

            int l = 0, r = n - 1;

            while (l < n && v[l] == l + 1)
                l++;

            while (r >= 0 && v[r] == r + 1)
                r--;

            System.out.println(r > l ? r - l + 1 : 0);
        }
    }
}

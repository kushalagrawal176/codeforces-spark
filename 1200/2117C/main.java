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
            int ans = 0;

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            Set<Integer> cur = new HashSet<>();
            Set<Integer> seen = new HashSet<>();

            for (int i = 0; i < n; i++) 
            {
                cur.add(a[i]);
                seen.add(a[i]);

                if (cur.size() == seen.size()) 
                {
                    ans++;
                    seen.clear();
                }
            }

            System.out.println(ans);
        }
    }
}

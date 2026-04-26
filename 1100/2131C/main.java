import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Map<Integer, Integer> s = new HashMap<>();
            Map<Integer, Integer> p = new HashMap<>();

            // First array
            for (int i = 0; i < n; i++) 
            {
                int a = sc.nextInt();

                s.put(a % k, s.getOrDefault(a % k, 0) + 1);
                s.put(k - a % k, s.getOrDefault(k - a % k, 0) + 1);
            }

            // Second array
            for (int i = 0; i < n; i++) 
            {
                int a = sc.nextInt();

                p.put(a % k, p.getOrDefault(a % k, 0) + 1);
                p.put(k - a % k, p.getOrDefault(k - a % k, 0) + 1);
            }

            if (s.equals(p))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

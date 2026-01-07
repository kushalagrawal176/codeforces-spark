import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        Map<String, Integer> mp = new HashMap<>();
        String ans = "";
        int maxm = 0;

        for (int i = 0; i < n - 1; i++) 
        {
            String p = s.substring(i, i + 2);
            mp.put(p, mp.getOrDefault(p, 0) + 1);

            if (mp.get(p) > maxm) 
            {
                maxm = mp.get(p);
                ans = p;
            }
        }

        System.out.println(ans);
    }
}

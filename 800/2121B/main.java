import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            String s = sc.next();

            Map<Character, Integer> mp = new HashMap<>();
            mp.put(s.charAt(0), mp.getOrDefault(s.charAt(0), 0) + 1);
            mp.put(s.charAt(n - 1), mp.getOrDefault(s.charAt(n - 1), 0) + 1);

            boolean flag = false;
            for (int i = 1; i < n - 1; i++) 
            {
                char c = s.charAt(i);
                if (mp.containsKey(c) && mp.get(c) > 0) 
                {
                    flag = true;
                    break;
                }
                mp.put(c, mp.getOrDefault(c, 0) + 1);
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

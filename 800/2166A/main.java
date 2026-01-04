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
            String s = sc.next();

            int cnt = 0;
            // Traverse from second last character down to the first
            for (int i = n - 2; i >= 0; i--) 
            {
                if (s.charAt(i) == s.charAt(n - 1))
                    continue;
                else
                    cnt++;
            }

            System.out.println(cnt);
        }
    }
}

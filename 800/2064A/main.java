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
            char ch = s.charAt(0);

            for (int i = 1; i < n; i++) 
            {
                if (ch != s.charAt(i)) 
                {
                    cnt++;
                    ch = s.charAt(i);
                }
            }

            if (s.charAt(0) == '1')
                cnt++;

            System.out.println(cnt);
        }
    }
}

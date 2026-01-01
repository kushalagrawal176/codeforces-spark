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
            int k = sc.nextInt();

            StringBuilder ans = new StringBuilder();

            // Append k times '1'
            for (int i = 0; i < k; i++)
                ans.append('1');

            // Append (n-k) times '0'
            for (int i = k; i < n; i++)
                ans.append('0');

            System.out.println(ans.toString());
        }
    }
}

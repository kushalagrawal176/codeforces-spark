import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = Math.min(a, b);

            // Keep incrementing until condition is satisfied
            while (ans % a != ans % b) 
            {
                ans++;
            }

            System.out.println(ans);
        }
    }
}

import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int sum = 0;
            int maxi = -100;

            for (int i = 0; i < 7; i++) 
            {
                int a = sc.nextInt();
                maxi = Math.max(maxi, a);
                sum -= a;
            }

            System.out.println(sum + 2 * maxi);
        }
    }
}

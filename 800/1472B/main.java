import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();  // number of coins

            int sum = 0;
            int c1 = 0;  // count of coins with value 1
            int c2 = 0;  // count of coins with value 2

            for (int i = 0; i < n; i++) 
            {
                int a = sc.nextInt();
                sum += a;

                if (a == 1)
                    c1++;
                else
                    c2++;
            }

            // Check if total sum can be divided equally
            if (sum % 2 == 0) 
            {
                // If half of sum is even, it's always possible
                if ((sum / 2) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    // If half is odd, we need at least two coins of value 1
                    if (c1 >= 2)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}

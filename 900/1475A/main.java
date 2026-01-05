import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            long n = sc.nextLong();

            // Check if n is NOT a power of 2
            if ((n & (n - 1)) != 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

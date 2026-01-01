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

            if (n % 3 == 1) 
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

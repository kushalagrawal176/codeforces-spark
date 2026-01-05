import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if (2 * k - 1 <= n)
            System.out.println(2 * k - 1);
        else
            System.out.println(2 * (k - (n + 1) / 2));
    }
}

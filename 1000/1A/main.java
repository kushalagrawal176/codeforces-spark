import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        long n = sc.nextLong();
        long a = sc.nextLong();

        // Formula: ceil(n / a) * ceil(m / a)
        long result = ((n - 1) / a + 1) * ((m - 1) / a + 1);

        System.out.println(result);
    }
}

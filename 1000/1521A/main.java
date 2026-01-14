import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        long t = sc.nextLong();

        while (t-- > 0) 
        {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b == 1)
                System.out.println("NO");
            else 
            {
                System.out.println("YES");
                System.out.println(a + " " + (a * b) + " " + (a * (b + 1)));
            }
        }
    }
}

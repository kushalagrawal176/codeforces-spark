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
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a + b == c - b && a + b == d - c)
                System.out.println(3);
            else if (a + b == c - b || a + b == d - c || c - b == d - c)
                System.out.println(2);
            else
                System.out.println(1);
        }
    }
}

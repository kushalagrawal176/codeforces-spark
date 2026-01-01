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
            int x = sc.nextInt();
            int y = sc.nextInt();

            // Check if 'a' lies strictly between x and y
            if ((a > x && a < y) || (a < x && a > y))
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}

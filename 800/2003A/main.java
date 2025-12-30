import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            String s = sc.next();

            if (n == 2) 
            {
                if (s.charAt(0) == s.charAt(1))
                    System.out.println("NO");
                else
                    System.out.println("YES");
            } 
            else if (n > 2) 
            {
                if (s.charAt(0) == s.charAt(n - 1))
                    System.out.println("NO");
                else
                    System.out.println("YES");
            } 
            else
                System.out.println("NO");
        }
    }
}

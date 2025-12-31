import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (0 + m <= r)
                System.out.println(0 + " " + m);
            else if (0 + m > r)
                System.out.println((r - m) + " " + r);
            else if (0 - m >= l)
                System.out.println((0 - m) + " " + 0);
            else 
            {}
        }
    }
}

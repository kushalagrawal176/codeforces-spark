import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // total number of stairs
        int m = sc.nextInt();  // step size constraint

        int f;

        if (m > n)
            f = -1;
        else 
        {
            // minimum steps Dreamoon can take is ceil(n/2)
            f = (n + 1) / 2;

            // find the smallest multiple of m >= ceil(n/2)
            while (f % m != 0) 
                f++;
        }

        System.out.println(f);
    }
}

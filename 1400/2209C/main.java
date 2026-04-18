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

            int a;
            int idx = 0;

            // First loop: query pairs (i, i+1)
            for (int i = 3; i < 2 * n; i += 2) 
            {
                System.out.println("? " + i + " " + (i + 1));
                System.out.flush();

                a = sc.nextInt();

                if (a == 1)
                    idx = i;
            }

            // Additional queries
            System.out.println("? 1 3");
            System.out.flush();

            a = sc.nextInt();
            if (a == 1)
                idx = 1;

            System.out.println("? 1 4");
            System.out.flush();

            a = sc.nextInt();
            if (a == 1)
                idx = 1;

            // Final answer
            if (idx == 0)
                System.out.println("! 2");
            else
                System.out.println("! " + idx);
        }
    }
}

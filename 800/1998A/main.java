import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int xc = sc.nextInt();
            int yc = sc.nextInt();
            int k = sc.nextInt();

            if (k == 1)
                System.out.println(xc + " " + yc);
            else 
            {
                for (int i = 1; i <= k / 2; i++)
                    System.out.println((xc - i) + " " + (yc - i));

                for (int i = 1; i <= k / 2; i++)
                    System.out.println((xc + i) + " " + (yc + i));

                if (k % 2 != 0)
                    System.out.println(xc + " " + yc);
            }
        }
    }
}

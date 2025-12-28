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

            int zero = 3;
            int one = 1;
            int two = 2;
            int three = 1;
            int five = 1;

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int cnt = -1;

            for (int i = 0; i < n; i++) 
            {
                int num = a[i];

                if (num == 0) 
                    zero--;
                else if (num == 1) 
                    one--;
                else if (num == 2) 
                    two--;
                else if (num == 3) 
                    three--;
                else if (num == 5) 
                    five--;

                if (zero <= 0 && one <= 0 && two <= 0 && three <= 0 && five <= 0) 
                {
                    cnt = i + 1;
                    break;
                }
            }

            if (cnt == -1)
                System.out.println(0);
            else
                System.out.println(cnt);
        }
    }
}

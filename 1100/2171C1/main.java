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

            int[] a = new int[n];
            int[] b = new int[n];

            int one_1 = 0;
            int one_2 = 0;

            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
                if (a[i] == 1) 
                    one_1++;
            }

            for (int i = 0; i < n; i++) 
            {
                b[i] = sc.nextInt();
                if (b[i] == 1) 
                    one_2++;
            }

            for (int i = 0; i < n; i++) 
            {
                if (i % 2 == 0) 
                {
                    if (one_1 % 2 == 1) 
                        continue;
                    else 
                    {
                        if (a[i] == 0 && b[i] == 1) 
                        {
                            one_1++;
                            one_2--;
                        } else if (a[i] == 1 && b[i] == 0) 
                        {
                            one_1--;
                            one_2++;
                        }
                    }
                } 
                else 
                {
                    if (one_2 % 2 == 1) 
                        continue;
                    else 
                    {
                        if (a[i] == 0 && b[i] == 1) 
                        {
                            one_1++;
                            one_2--;
                        } 
                        else if (a[i] == 1 && b[i] == 0) 
                        {
                            one_1--;
                            one_2++;
                        }
                    }
                }
            }

            if (one_1 % 2 == one_2 % 2)
                System.out.println("Tie");
            else if (one_1 % 2 == 1)
                System.out.println("Ajisai");
            else
                System.out.println("Mai");
        }
    }
}

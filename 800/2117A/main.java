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
            int x = sc.nextInt();

            int[] a = new int[n];
            int index = -1;

            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
                if (a[i] == 1 && index == -1)
                    index = i; // first occurrence of 1
            }

            int index1 = -1;
            for (int i = n - 1; i >= 0; i--) 
            {
                if (a[i] == 1) 
                {
                    index1 = i; // last occurrence of 1
                    break;
                }
            }

            if (index == -1 || index1 - index + 1 <= x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

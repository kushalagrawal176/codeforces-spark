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
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int cnt = 0;
            int curr = 0;

            for (int i = 0; i < n; i++) 
            {
                if (a[i] == 1)
                    curr = 0;
                else 
                {
                    curr++;
                    if (curr == k) 
                    {
                        cnt++;
                        i++;       // skip next element
                        curr = 0;  // reset counter
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}

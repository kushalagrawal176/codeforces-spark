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
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            boolean flag = true;

            for (int i = 0; i < n - 1; i++) 
            {
                int diff = Math.abs(arr[i + 1] - arr[i]);
                if (diff == 5 || diff == 7) {
                    // valid difference
                } 
                else 
                {
                    flag = false;
                    break;
                }
            }

            if (!flag) 
                System.out.println("NO");
            else 
                System.out.println("YES");
        }
    }
}

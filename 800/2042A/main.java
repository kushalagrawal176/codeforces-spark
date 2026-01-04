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

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            Arrays.sort(arr);

            int cnt = 0;
            int sum = 0;

            for (int i = n - 1; i >= 0; i--) 
            {
                sum += arr[i];
                if (sum == k)
                    break;
                else if (sum > k) 
                {
                    cnt = k - sum + arr[i];
                    break;
                }
            }

            if (sum < k)
                System.out.println(k - sum);
            else
                System.out.println(cnt);
        }
    }
}

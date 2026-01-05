import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < n - 1; i++) 
        {
            if (arr[i + 1] >= arr[i]) 
            {
                cnt++;
                if (cnt > ans)
                    ans = cnt;
            } 
            else 
            {
                if (cnt > ans)
                    ans = cnt;
 
                cnt = 0;
            }
        }

        System.out.println(ans + 1);
    }
}

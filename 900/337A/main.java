import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < m; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int mini = Integer.MAX_VALUE;
        for (int i = 0; i + n - 1 < m; i++)
            mini = Math.min(arr[i + n - 1] - arr[i], mini);

        System.out.println(mini);
    }
}

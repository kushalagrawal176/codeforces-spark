import java.util.*;

public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        // Sort the array
        Arrays.sort(arr);
        
        int sum = 0;
        for (int i = 0; i < m; i++) 
        {
            if (arr[i] >= 0)
                break;
        
            sum += arr[i];
        }
        
        System.out.println(-sum);
    }
}

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
 
            int sum = 0;
            int j = 0;
            int maxLength = -1;
 
            for (int i = 0; i < n; i++) 
            {
                sum += a[i];
                while (sum > k && j <= i) 
                {
                    sum -= a[j];
                    j++;
                }
                
                if (sum == k)
                    maxLength = Math.max(maxLength, i - j + 1);
            }
 
            int ans = (maxLength == -1) ? -1 : n - maxLength;
            System.out.println(ans);
        }
    }
}
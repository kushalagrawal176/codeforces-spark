import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            a[0] = sc.nextInt();
            int mini = a[0];
            
            for(int i=1;i<n;i++)
            {
                a[i] = sc.nextInt();
                mini = Math.min(mini, a[i]);
            }
            
            int sum = 0;
            for(int i=0;i<n;i++)
                sum += a[i] - mini;
            
            System.out.println(sum);
        }
    }
}

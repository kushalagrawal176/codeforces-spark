import java.util.*;
public class main
{
    public static long count(int n, int a[], int k)
    {
        long cnt = 0;
        int low = 0;
        int high = n-1;
        
        while(low < high)
        {
            while(low < high && a[low] + a[high] > k)
                high--;
            
            cnt += high - low;
            low++;
        }
        
        return cnt;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            
            int a[] = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            
            System.out.println(count(n, a, r) - count(n, a, l-1));
        }
    }
}
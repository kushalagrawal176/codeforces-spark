import java.util.*;
public class main
{
    public static int binary_search(int a[], int num, int low, int high)
    {
        int idx = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(a[mid] > num)
            {
                idx = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }
 
        return idx;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        int b[] = new int[n];
        
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        for(int i=0;i<n;i++)
            b[i] = sc.nextInt();
            
        for(int i=0;i<n;i++)
            a[i] = a[i] - b[i];
        
        Arrays.sort(a);
        
        long cnt = 0;
        for(int i=0;i<n;i++)
        {
            int idx = binary_search(a, (-1)*a[i], i+1, n-1);
            
            if(idx == -1)
                continue;
            cnt += n - idx;
        }
        
        System.out.println(cnt);
    }
}
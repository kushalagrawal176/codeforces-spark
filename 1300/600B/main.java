import java.util.*;
public class main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
            
        Arrays.sort(a);
        
        for(int i=0;i<m;i++)
        {
            int x = sc.nextInt();
            int l = 0;
            int r = a.length-1;
            
            while(l <= r)
            {
                int mid = (l+r)/2;
                if(a[mid] <= x)
                    l = mid+1;
                else
                    r = mid-1;
            }
            
            System.out.printf("%d ",r+1);
        }
    }
}
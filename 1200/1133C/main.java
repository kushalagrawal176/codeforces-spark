import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        Arrays.sort(a);
        
        int maxi = Integer.MIN_VALUE;
        
        int l = 0;
        int r = 1;
        
        while(r < n)
        {
            if(a[r]-a[l] > 5)
            {
                maxi = Math.max(maxi, r-l);
                while(l<=r && a[r]-a[l] > 5)
                    l++;
            }
            
            r++;
        }
        maxi = Math.max(maxi, r-l);
        
        System.out.println(maxi);
    }
}
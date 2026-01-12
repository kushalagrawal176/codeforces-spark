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
            long a[] = new long[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();
            
            Arrays.sort(a);
            
            int l = (n-1)/2;
            int r = l+1;
            
            while(l >= 0 || r < n)
            {
                if(l >= 0)
                    System.out.print(a[l]+" ");
                if(r < n)
                    System.out.print(a[r]+" ");
                
                l--;
                r++;
            }
            
            System.out.println();
        }
    }
}
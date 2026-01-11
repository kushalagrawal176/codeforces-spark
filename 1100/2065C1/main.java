import java.util.*;
 
public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int l = 0;
            
            int []a = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
                
            int b = sc.nextInt();
            for(int i=0;i<n;i++)
            {
                a[i] = Math.min(a[i], b-a[i]);
                if(i !=0 && a[i] < a[i-1])
                    a[i] = b-a[i];
            }
            
            for(int i=0;i<n-1;i++)
            {
                if(a[i] <= a[i+1])
                    l++;
            }
        
            System.out.println(l==n-1?"YES":"NO");
        }
    }
}
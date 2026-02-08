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
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            int i = 0;
            for(;i<n-1;i++)
            {
                if(a[i] > a[i+1])
                {
                    System.out.println("NO");
                    break;
                }
                
                a[i+1] -= a[i];
            }
            
            if(i == n-1)
                System.out.println("YES");
        }
    }
}
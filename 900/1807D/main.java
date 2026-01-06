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
            int q = sc.nextInt();
            
            int a[] = new int[n];
            int b[] = new int[n];
            
            b[0] = 0;
            a[0] = sc.nextInt();
            
            for(int i=1;i<n;i++)
            {
                a[i] = sc.nextInt();
                b[i] = b[i-1];
                
                if(a[i-1]%2 == 1)
                    b[i] = b[i]+1;
            }
            
            int total = b[n-1];
            if(a[n-1]%2 == 1)
                total++;
            
            for(int i=0;i<q;i++)
            {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                
                int odd = b[r-1] - b[l-1];
                if(a[r-1]%2 == 1)
                    odd++;
                
                if((total-odd)%2 == 1)
                {
                    if((r-l+1)%2 == 1 && k%2 == 1)
                        System.out.println("NO");
                    else
                        System.out.println("YES");
                }
                else
                {
                    if((r-l+1)%2 == 1 && k%2 == 1)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
            }
        }
    }
}
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
            long l = sc.nextLong();
            long r = sc.nextLong();
            
            long a[] = new long[n];
            boolean flag = true;
            
            for(int i=1;i<=n;i++)
            {
                if(l%i == 0)
                    a[i-1] = l;
                else
                {
                    long val = (l/i + 1)*i;
                    if(val > r)
                    {
                        flag = false;
                        break;
                    }
                    
                    a[i-1] = val;
                }
            }
            
            if(flag == false)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                for(int i=0;i<n;i++)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
        }
    }
}

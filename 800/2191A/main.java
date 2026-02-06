import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            
            int[] a = new int[n + 1];
            for (int i = 0; i < n; i++) 
            {
                int ele = sc.nextInt();
                a[ele] = i;  // store index of element
            }
            
            boolean flag = true;
            for (int i = 1; i <= n; i++) 
            {
                if (i == 1) 
                {
                    if (Math.abs(a[2] - a[1]) % 2 == 0)
                        flag = false;
                } 
                else if (i == n) 
                {
                    if (Math.abs(a[n] - a[n - 1]) % 2 == 0)
                        flag = false;
                } 
                else 
                {
                    if (Math.abs(a[i] - a[i - 1]) % 2 == 0)
                        flag = false;
                    else if (Math.abs(a[i] - a[i + 1]) % 2 == 0)
                        flag = false;
                }
            }
            
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

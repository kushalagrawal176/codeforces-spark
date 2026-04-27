import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int p[] = new int[n+1];
 
            for(int i=0;i<n;i++)
                p[sc.nextInt()] = i;
 
            int l = p[n], r = p[n], ok = 1;
 
            for(int k=1;k<=n;k++)
            {
                int v = n-k+1;
                l = Math.min(l, p[v]);
                r = Math.max(r, p[v]);
 
                if(r-l+1 != k)
                {
                    ok = 0;
                    break;
                }
            }
            System.out.println(ok == 1 ? "YES":"NO");
        }
    }
}
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
 
            int diff = 0;
            for(int i=1;i<=n;i++)
                diff = diff + Math.abs(i-a[i-1]);
 
            //System.out.println(diff+" diff");
            if(a[0] == n && a[n-1] == 1)
                System.out.println(3);
            else if(diff == 0)
                System.out.println(0);
            else if(a[0] == 1 || a[n-1] == n)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}

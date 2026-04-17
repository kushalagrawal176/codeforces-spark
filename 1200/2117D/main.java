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
            
            boolean flag = true;
 
            int d = a[1] - a[0];
            for(int i=1;i<n;i++)
            {
                if(a[i]-a[i-1] != d)
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag == true)
                flag = (a[0]-d >= 0) && (a[0]+n*d >= 0) && ((a[0]-d)%(n+1) == 0);
            
            System.out.println(flag == true ? "YES":"NO");
        }
    }
}
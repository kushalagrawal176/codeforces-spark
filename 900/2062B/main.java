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
            boolean flag = true;
 
            for(int i=0;i<n;i++)
            {
                int x = sc.nextInt();
 
                if(!flag) 
                    continue;
 
                int max = Math.max(((n-i-1)*2), (i*2));
                if(x <= max) 
                    flag = false;
            }
 
            System.out.println((flag) ? "YES":"NO");
        }
    }
}
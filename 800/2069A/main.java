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
            int a[] = new int[n-2];
            
            for(int i=0;i<n-2;i++)
                a[i] = sc.nextInt();
            
            boolean flag = true;
            for(int i=0;i<n-4;i++)
            {
                if(a[i] == 1 && a[i+1] == 0 && a[i+2] == 1)
                    flag = false;
            }
            
            if(flag == false)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
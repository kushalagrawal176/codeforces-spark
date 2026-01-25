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
            
            Arrays.sort(a);
            
            long sum = 1;
            boolean flag = (a[0] == 1);
            
            for(int i=1;i<n;i++)
            {
                if(a[i] <= sum)
                    sum += a[i];
                else
                    flag = false;
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
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
            int two = 0;
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                if(a[i] == 2)
                    two++;
            }
            
            int curr = 0;
            int i = 0;
            for(;i<n;i++)
            {
                if(a[i] == 2)
                {
                    curr++;
                    two--;
                }
                
                if(curr == two)
                    break;
            }
            
            if(i == n)
                System.out.println(-1);
            else
                System.out.println(i+1);
        }
    }
}
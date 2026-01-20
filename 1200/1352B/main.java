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
            int k = sc.nextInt();
            
            if(n >= k && ((n-k)&1) == 0)
            {
                System.out.println("YES");
                for(int i=1;i<k;i++)
                    System.out.print("1 ");
                System.out.println(n - (k-1));
            }
            else if(n >= 2*k && ((n-2*k)&1) == 0)
            {
                System.out.println("YES");
                for(int i=1;i<k;i++)
                    System.out.print("2 ");
                System.out.println(n - 2*(k-1));
            }
            else
                System.out.println("NO");
        }
    }
}
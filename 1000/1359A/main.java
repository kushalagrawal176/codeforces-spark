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
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            if(n/k >= m || m == 0)
                System.out.println(m);
            else
            {
                int r = (int)Math.ceil((m-(n/k))/(double)(k-1));
				System.out.println((n/k)-r);
            }
        }
    }
}
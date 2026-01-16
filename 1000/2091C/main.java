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
            
            if((n&1) == 0)
                System.out.println(-1);
            else
            {
                for(int i=n;i>=1;i--)
                    System.out.print(i+" ");
                System.out.println();
            }
        }
    }
}
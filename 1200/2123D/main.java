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

            String s = sc.next();
            int one = 0;
            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '1')
                    one++;
            }
            
            if(one <= k || n < 2*k)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
    }
}
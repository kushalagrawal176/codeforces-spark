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
 
            if(n >= k)
            {
                if((n+k)%2 == 0)
                    System.out.println(0);
                else
                    System.out.println(1);
            }
            else
                System.out.println(k-n);
        }
    }
}
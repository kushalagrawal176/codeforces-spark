import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int ans = 2;
 
            if(a == b)
                ans = 0;
            else if(a%b == 0 || b%a == 0)
                ans = 1;
            else
                ans = 2;
            
            System.out.println(ans);
        }
    }
}
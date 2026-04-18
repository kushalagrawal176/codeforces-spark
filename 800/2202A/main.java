import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int sum = (x+y);
            
            if(sum >= 0 && sum%3 == 0 && sum/3 >= Math.abs(y))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
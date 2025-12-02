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
            
            int minSide = Math.min(a, b);
            int maxSide = Math.max(a, b);
 
            int s = Math.max(2 * minSide, maxSide);
            
            System.out.println(s * s);
        }
    }
}
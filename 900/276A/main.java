import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int maxJoy = Integer.MIN_VALUE;
        
        while(n-- > 0)
        {
            int f = sc.nextInt();
            int t = sc.nextInt();
 
            maxJoy = Math.max(maxJoy, t>k ? f-t+k : f);
        }
        
        System.out.println(maxJoy);
    }
}
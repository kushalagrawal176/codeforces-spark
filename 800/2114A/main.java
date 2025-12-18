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
            
            if(Math.sqrt(n) == (int)Math.sqrt(n))
                System.out.println(0 + " " + (int)Math.sqrt(n));
            else
                System.out.println("-1");
        }
    }
}
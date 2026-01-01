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
            
            if(((n+m) & 1) == 0)
                System.out.println("Tonya");
            else
                System.out.println("Burenka");
        }
    }
}
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
            int c = sc.nextInt();
            int d = sc.nextInt();
            
            boolean k1 = 2*(Math.min(a, b) + 1) >= (Math.max(a, b));
            boolean k2 = 2*(Math.min(c-a, d-b) + 1) >= (Math.max(c-a, d-b));
            
            if(k1 && k2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
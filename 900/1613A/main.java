import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0) 
        {
            int x1 = sc.nextInt();
            int p1 = sc.nextInt();
            int x2 = sc.nextInt();
            int p2 = sc.nextInt();
 
            x1 = (int)(x1 * (Math.pow(10, p1 - Math.min(p1, p2))));
            x2 *= Math.pow(10, p2 - Math.min(p1, p2));
 
            if(x1 > x2) 
                System.out.println(">");
            else if(x1 < x2) 
                System.out.println("<");
            else 
                System.out.println("=");
        }
    }
}
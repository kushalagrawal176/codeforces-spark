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
            
            if(2*a > b)
                System.out.println("-1 -1");
            else
                System.out.println(a + " " + 2*a);
        }
    }
}
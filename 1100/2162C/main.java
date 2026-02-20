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
            
            if(b > a && (a^b) > a)
                System.out.println(-1);
            else if(a == b)
                System.out.println(0);
            else if((a^b) > a)
                System.out.println(2 + "\n" + b + " " + a);
            else
                System.out.println(1 + "\n" + (a^b));
        }
    }
}
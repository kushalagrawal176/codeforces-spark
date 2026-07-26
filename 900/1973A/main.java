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
            
            if((a+b+c)%2 == 1)
                System.out.println(-1);
            else
                System.out.println(Math.min((a+b+c)/2, a+b));
        }
    }
}
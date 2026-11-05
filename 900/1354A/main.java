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
 
            if(a <= b) 
                System.out.println(b);
            else if(c <= d) 
                System.out.println(-1);
            else if(a == b && b == c && c == d)
                System.out.println(a);
            else
            {
                long s = (long)((a-b)/(c-d))*c+b;
                if((a-b)%(c-d) != 0)
                    s += c;
 
                System.out.println(s);
            }
        }
    }
}
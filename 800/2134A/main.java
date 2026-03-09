import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if((n-b)%2 == 0 && ((n-a)%2 == 0 || a <= b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
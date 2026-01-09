import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long sum = a+b+c;
            
            if(sum%9 == 0 && a >= sum/9 && b >= sum/9 && c >= sum/9)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
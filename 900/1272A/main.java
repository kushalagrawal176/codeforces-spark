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

            long ans = Math.max((Math.abs(a-b)+Math.abs(a-c)+Math.abs(b-c))-4, 0);

            System.out.println(ans);
        }
    }
}
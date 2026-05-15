import java.util.*;
public class main
{
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt(), m = sc.nextInt();
            System.out.println(Math.min(n,m)>=2 && Math.max(n,m)>=3 ? "YES" : "NO");
        }
    }
}
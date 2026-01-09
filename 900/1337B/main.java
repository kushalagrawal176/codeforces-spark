import java.util.*;
 
public class main 
{
    static Map<String, Boolean> memo = new HashMap<>();
 
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) 
        {
            int x = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            if (canDefeat(x, n, m))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
 
    public static boolean canDefeat(int x, int n, int m) 
    {
        if (x <= 0) 
            return true;
        if (n == 0 && m == 0) 
            return false;
 
        String key = x + "," + n + "," + m;
        if (memo.containsKey(key)) 
            return memo.get(key);
 
        boolean res = false;
        if (n > 0)
            res = canDefeat(x / 2 + 10, n - 1, m);
        if (!res && m > 0)
            res = canDefeat(x - 10, n, m - 1);
 
        memo.put(key, res);
        return res;
    }
}
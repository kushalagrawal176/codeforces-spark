import java.util.*;
public class main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            String s = sc.next();
 
            int cnt0 = 0, cnt1 = 0;
 
            for (int i=0;i<n;i++) 
            {
                if (s.charAt(i) == '0') 
                    cnt0++;
                else
                    cnt1++;
            }
 
            int maxPairs = (cnt0 / 2) + (cnt1 / 2);
            int minPairs = Math.abs(cnt0 - cnt1) / 2;
 
            if (k >= minPairs && k <= maxPairs && (k - minPairs) % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
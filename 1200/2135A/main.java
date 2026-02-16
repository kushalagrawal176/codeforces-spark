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
            
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++)
                a[i] = sc.nextInt();
            
            int[] dp = new int[n + 1];
 
            Map<Integer, ArrayList<Integer>> map = new HashMap<>();
            
            for(int i = 1; i <= n; i++) 
            {
                dp[i] = dp[i - 1];
                
                int v = a[i];
 
                map.putIfAbsent(v, new ArrayList<>());
                map.get(v).add(i);
                
                ArrayList<Integer> list = map.get(v);
                
                if(list.size() >= v)
                {
                    int pos = list.get(list.size() - v);
                    dp[i] = Math.max(dp[i], dp[pos - 1] + v);
                }
            }
            
            System.out.println(dp[n]);
        }
    }
}
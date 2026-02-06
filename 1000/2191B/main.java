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
            
            Map<Integer, Integer> mp = new HashMap<>();
            Map<Integer, Integer> mp1 = new HashMap<>();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
            {
                a[i] = sc.nextInt();
                mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
            }
            
            Arrays.sort(a);
            
            int l;
            if (a[0] != 0)
                l = 0;
            else
                l = 1;
            
            boolean flag = true;
            for (int i = 0; i < n - 1; i++) 
            {
                // decrease count in mp
                mp.put(a[i], mp.get(a[i]) - 1);
                // increase count in mp1
                mp1.put(a[i], mp1.getOrDefault(a[i], 0) + 1);
                
                l = 0;
                while (mp1.getOrDefault(l, 0) > 0)
                    l++;
                
                int r = 0;
                while (mp.getOrDefault(r, 0) > 0)
                    r++;
                
                if (l == r) 
                {
                    flag = false;
                    break;
                }
            }
            
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

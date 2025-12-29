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
            int cnt = 0;
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            
            for (int i = 0; i < n; i++) 
            {
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
                
                if (mp.get(arr[i]) == 2) 
                {
                    cnt++;
                    mp.put(arr[i], 0); // reset after forming a pair
                }
            }
            
            System.out.println(cnt);
        }
    }
}

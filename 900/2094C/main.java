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
            
            HashMap<Integer, Integer> mp = new HashMap<>();
            StringBuilder s = new StringBuilder();
            
            // Read the n x n matrix
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    int a = sc.nextInt();
                    mp.put(a, mp.getOrDefault(a, 0) + 1);
                    
                    if (mp.get(a) == 1)
                        s.append(" ").append(a);
                }
            }
            
            // Find the missing number in range [1, 2n]
            for (int i = 1; i <= 2 * n; i++) 
            {
                if (!mp.containsKey(i)) 
                {
                    s.insert(0, i); // prepend missing number
                    break;
                }
            }
            
            System.out.println(s.toString());
        }
    }
}

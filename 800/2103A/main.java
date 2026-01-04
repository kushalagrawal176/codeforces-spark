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
            
            HashSet<Integer> set = new HashSet<>();
            
            for (int i = 0; i < n; i++) 
            {
                int num = sc.nextInt();
                set.add(num);  // store unique numbers
            }
            
            System.out.println(set.size());
        }
    }
}

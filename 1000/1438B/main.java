import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            HashMap<Integer, Integer> mp = new HashMap<>();
            
            boolean flag = false;
            while(n-- > 0)
            {
                int a = sc.nextInt();
                
                if(mp.get(a) == null)
                    mp.put(a, 1);
                else
                    flag = true;
            }
            
            System.out.println((flag == true) ? "YES" : "NO");
        }
    }
}
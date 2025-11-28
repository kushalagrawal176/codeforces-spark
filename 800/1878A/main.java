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
            int k = sc.nextInt();
            
            HashMap<Integer, Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(mp.get(a) == null)
                    mp.put(a, 1);
                else
                    mp.put(a, mp.get(a)+1);
            }
            
            if(mp.get(k) == null)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
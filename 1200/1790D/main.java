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
            HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if(mp.get(a) == null)
                    mp.put(a, 1);
                else
                    mp.put(a, mp.get(a)+1);
            }
            
            long cnt = 0;
            for(int key : mp.keySet())
            {
                cnt += Math.max(0, mp.get(key)-mp.getOrDefault(key-1, 0));
            }
            
            System.out.println(cnt);
        }
    }
}
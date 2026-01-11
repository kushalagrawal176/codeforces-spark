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
            int ele;
            int freq = Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                
                if(mp.get(a) == null)
                    mp.put(a, 1);
                else
                    mp.put(a, mp.get(a)+1);
                
                if(freq < mp.get(a))
                {
                    freq = mp.get(a);
                    ele = a;
                }
            }
            
            int rem = n - freq;
            int cnt = 0;
            while(rem > 0)
            {
                cnt++;
                if(rem <= freq)
                {
                    cnt += rem;
                    rem = 0;
                }
                else
                {
                    cnt += freq;
                    rem -= freq;
                    freq = freq*2;
                }
            }
            
            System.out.println(cnt);
        }
    }
}
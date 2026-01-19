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
            int a[] = new int[n];
            
            HashMap<Integer, Integer> mp = new HashMap<>();
            
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                
                if(mp.get(i-a[i]) == null)
                    mp.put(i - a[i], 1);
                else
                    mp.put(i - a[i], mp.get(i-a[i])+1);
            }
            
            long cnt = 0;
            for(int i=0;i<n;i++)
            {
                if(mp.get(i-a[i]) > 1)
                {
                    cnt += mp.get(i-a[i])-1;
                    mp.put(i-a[i], mp.get(i-a[i])-1);
                }
            }
            
            System.out.println(cnt);
        }
    }
}
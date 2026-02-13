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
            int[] a = new int[n];
            for(int i=0;i<n;i++) 
                a[i] = sc.nextInt();
                
            HashMap<Long,Integer> mp = new HashMap<>();
            boolean flag = false;
            
            long sum = 0;
            mp.put(0L,0);
            
            for(int i=0;i<n;i++)
            {
                if(i%2 == 0) 
                    sum += a[i];
                else 
                    sum -= a[i];
                    
                if(mp.containsKey(sum))
                {
                    flag = true;
                    break;
                }
                
                mp.put(sum, 1);
            }
            
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
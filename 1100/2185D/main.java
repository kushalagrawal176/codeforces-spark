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
            int m = sc.nextInt();
            
            long h = sc.nextLong();
            
            long a[] = new long[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextLong();
                
            HashMap<Integer, Long> mp = new HashMap<>();
            
            while(m-- > 0)
            {
                int b = sc.nextInt()-1;
                long c = sc.nextLong();
                
                if(mp.get(b) == null)
                    mp.put(b, a[b]+c);
                else
                    mp.put(b, mp.get(b)+c);
                
                if(mp.get(b) > h)
                    mp.clear();
            }
            
            for(int i=0;i<n;i++)
            {
                if(mp.get(i) != null)
                    System.out.print(mp.get(i)+" ");
                else
                    System.out.print(a[i]+" ");
            }
            
            System.out.println();
        }
    }
}
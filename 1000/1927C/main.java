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
 
            int k = sc.nextInt();
            
            HashMap<Integer, Integer> mp1 = new HashMap<>();
            for(int i=0;i<n;i++)
                mp1.put(sc.nextInt(), 1);
 
            HashMap<Integer, Integer> mp2 = new HashMap<>();
            for(int i=0;i<m;i++)
                mp2.put(sc.nextInt(), 1);
            
            int exclusiveA = 0;
            int exclusiveB = 0;
            int common = 0;
            
            boolean possible = true;
 
            for(int i=1;i<=k;i++)
            {
                if(mp1.get(i) != null && mp2.get(i) != null)
                    common++;
                else if(mp1.get(i) != null)
                    exclusiveA++;
                else if(mp2.get(i) != null)
                    exclusiveB++;
                else
                {
                    possible = false;
                    break;
                }
            }

            if(!possible || exclusiveA > k/2 || exclusiveB > k/2)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
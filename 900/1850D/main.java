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
            
            ArrayList<Integer> a = new ArrayList<>();
            
            for(int i=0;i<n;i++)
                a.add(sc.nextInt());
            
            Collections.sort(a);
            
            int cnt = 1;
            int ans = 1;
            
            for(int i=0;i<n-1;i++)
            {
                if(a.get(i+1)-a.get(i) <= k)
                    cnt++;
                else
                    cnt = 1;
                    
                ans = Math.max(cnt,ans);
            }
            
            System.out.println(n-ans);
        }
    }
}

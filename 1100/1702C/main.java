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
            Map<Integer, int[]> pos = new HashMap<>();
 
            for(int i=1; i<=n; i++) 
            {
                int v = sc.nextInt();
                if(!pos.containsKey(v)) 
                    pos.put(v, new int[]{i, i});
                else 
                    pos.get(v)[1] = i;
            }
 
            while(k-- > 0) 
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
 
                int pa[] = pos.get(a);
                int pb[] = pos.get(b);
 
                System.out.println(pa != null && pb != null && pa[0] <= pb[1] ? "YES" : "NO");
            }
        }
    }
}
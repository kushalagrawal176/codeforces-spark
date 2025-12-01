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
            
            boolean flag = true;
            for(int i=0;i<n;i++)
            {
                int a = sc.nextInt();
                if(mp.get(a) != null)
                    flag = false;
                else
                    mp.put(a, 1);
            }
            
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
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
            
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            ArrayList<Integer> c = new ArrayList<>();
            
            int mini = Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
                mini = Math.min(mini, a.get(i));
            }
            
            int cnt = 0;
            for(int i=0;i<n;i++)
            {
                if(a.get(i) == mini)
                    cnt++;
            }
            
            if(cnt == n)
                System.out.println(-1);
            else
            {
                for(int i=0;i<n;i++)
                {
                    if(a.get(i) == mini)
                        b.add(mini);
                    else
                        c.add(a.get(i));
                }
                
                System.out.println(b.size() + " " + c.size());
                
                for(int i=0;i<b.size();i++)
                    System.out.print(b.get(i)+" ");
                System.out.println();
                
                for(int i=0;i<c.size();i++)
                    System.out.print(c.get(i)+" ");
                System.out.println();
            }
        }
    }
}
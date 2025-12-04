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
            
            for(int i=0;i<n;i++)
                a.add(sc.nextInt());
            
            int mini = Integer.MAX_VALUE;
            for(int i=0;i<n-1;i++)
                mini = Math.min(mini, a.get(i+1)-a.get(i));
            
            if(mini < 0)
                System.out.println(0);
            else
            {
                if(mini == 0)
                    System.out.println(1);
                else
                    System.out.println(mini/2 + 1);
            }
        }
    }
}
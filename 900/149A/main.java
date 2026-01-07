import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        
        for(int i=0;i<12;i++)
        {
            int t = sc.nextInt();
            a.add(t);
        }
        
        Collections.sort(a);
        
        int sum = 0;
        
        if(k == 0)
            System.out.println(0);
        else
        {
            boolean flag = false;
            for(int i=11;i>=0;i--)
            {
                sum = sum + a.get(i);
                if(sum >= k)
                {
                    flag = true;
                    System.out.println(12-i);
                    break;
                }
            }
            if(!flag)
                System.out.println(-1);
        }
    }
}
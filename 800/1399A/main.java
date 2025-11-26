import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            
            for(int i=0;i<n;i++)
            {
                a.add(sc.nextInt());
            }
            
            a.sort(null);
            boolean flag = true;
            
            for(int i=n-1;i>=1;i--)
            {
                if(Math.abs(a.get(i)-a.get(i-1)) <= 1)
                    continue;
                else
                {
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
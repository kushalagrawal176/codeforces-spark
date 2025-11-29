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
            
            int prev = sc.nextInt();
            int next;
            
            Boolean flag = true;
            
            for(int i=1;i<n;i++)
            {
                next = sc.nextInt();
                if(prev <= next)
                {}
                else
                    flag = false;
                prev = next;
            }
            
            if(flag == true || k > 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
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
            int first = sc.nextInt();
            
            for(int i=1;i<n;i++)
            {
                int a = sc.nextInt();
            }
            
            if(first == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
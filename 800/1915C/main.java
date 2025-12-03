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
            long sum = 0;
            
            for(int i=0;i<n;i++)
                sum = sum + sc.nextLong();
            
            if(Math.pow(sum, 0.5) == (long)Math.pow(sum, 0.5))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
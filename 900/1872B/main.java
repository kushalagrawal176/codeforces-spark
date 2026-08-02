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
            
            int minTime = 500;
            while(n-- > 0)
            {
                int d = sc.nextInt();
                int s = sc.nextInt();
 
                minTime = Math.min(minTime, s/2+d-((s%2==0)?1:0));
            }
            
            System.out.println(minTime);
        }
    }
}
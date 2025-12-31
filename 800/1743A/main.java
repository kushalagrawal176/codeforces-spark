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
            
            int cnt = 10-n;
            
            // accepting values is just formality
            for(int i=1;i<=n;i++)
                int temp = sc.nextInt();
                
            System.out.println((6*cnt*(cnt-1))/2);
        }
    }
}
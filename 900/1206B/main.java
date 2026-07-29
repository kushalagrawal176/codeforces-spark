import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long cost = 0;
        int negatives = 0;
        int zero = 0;
        
        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            
            if(a == 0)
            {
                cost++;
                zero++;
            }
            else if(a > 0)
                cost += a-1;
            else
            {
                cost += -1-a;
                negatives++;
            }
        }
        
        if(negatives%2 == 1 && zero == 0)
            cost += 2;
        
        System.out.println(cost);
    }
}
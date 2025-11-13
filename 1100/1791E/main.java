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
            
            int neg = 0; // to calculate number of negative elements
            long sum = 0;
            long mini = Long.MAX_VALUE;
            
            for(int i=0;i<n;i++)
            {
                long a = sc.nextLong();
                if(a < 0)
                    neg++;
                
                sum += Math.abs(a);
                mini = Math.min(mini, Math.abs(a));
            }
            
            if((neg&1) == 1)
                sum -= 2*mini; // subtracting twice the minimum absolute value as it is counted in sum once
            
            System.out.println(sum);
        }
    }
}
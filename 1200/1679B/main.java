import java.util.*;
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
 
        long[] lastVal = new long[n + 1];
        int[] lastTime = new int[n + 1];
 
        long sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            lastVal[i] = sc.nextLong();
            sum += lastVal[i];
            // lastTime[i] = 0 initially
        }
 
        long globalVal = 0;
        int globalTime = 0;
 
        for (int t = 1; t <= q; t++) 
        {
            int type = sc.nextInt();
            if (type == 1) 
            {
                int idx = sc.nextInt();
                long x = sc.nextLong();
 
                long oldVal;
                // If this element was updated after last global reset
                if (lastTime[idx] >= globalTime)
                    oldVal = lastVal[idx];
                else 
                {
                    // Otherwise its value was effectively globalVal
                    oldVal = globalVal;
                }
 
                sum = sum - oldVal + x;
                lastVal[idx] = x;
                lastTime[idx] = t; // update its timestamp
            } 
            else 
            {
                // type == 2
                long x = sc.nextLong();
                globalVal = x;
                globalTime = t;
                sum = n * x;
            }
 
            System.out.println(sum);
        }
    }
}
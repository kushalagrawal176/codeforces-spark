import java.util.*;
 
public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
 
            for (int i=0; i<n; i++) 
                arr[i] = sc.nextInt();
 
            // count = number of elements in the reduced subsequence
            int count = 1;
 
            // direction:
            //  0 = no direction yet
            //  1 = increasing
            // -1 = decreasing
            int direction = 0;
 
            for (int i=0; i<n-1; i++) 
            {
                // If the sequence goes up
                if (arr[i+1] > arr[i]) 
                {
                    // If we were already increasing, no new turning point
                    if (direction == 1) 
                        continue;
 
                    // Direction changes to increasing
                    direction = 1;
                    count++;
                }
                
                // If the sequence goes down
                else if (arr[i+1] < arr[i]) 
                {
                    // If we were already decreasing, no new turning point
                    if (direction == -1) 
                        continue;
 
                    // Direction changes to decreasing
                    direction = -1;
                    count++;
                }
 
                // If arr[i+1] == arr[i], do nothing (flat segment)
            }
 
            System.out.println(count);
        }
    }
}
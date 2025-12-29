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
 
            // Store types of each district (1-based indexing)
            long[] districtType = new long[n + 1];
 
            for (int i = 1; i <= n; i++)
                districtType[i] = sc.nextLong();
 
            // Find the first index where district type differs from previous one
            int firstDifferentIndex = -1;
            for (int i = 2; i <= n; i++) 
            {
                if (districtType[i] != districtType[i - 1]) 
                {
                    firstDifferentIndex = i;
                    break;
                }
            }
 
            // If all districts have the same type, connection is impossible
            if (firstDifferentIndex == -1) 
            {
                System.out.println("NO");
                continue;
            }
 
            System.out.println("YES");
 
            /*
             * Step 1:
             * Connect district 1 with all districts that have a different type
             */
            for (int i = 2; i <= n; i++) 
            {
                if (districtType[1] != districtType[i]) 
                    System.out.println(1 + " " + i);
            }
 
            /*
             * Step 2:
             * Connect remaining districts (same type as district 1)
             * using the first district that had a different type
             */
            for (int i = 2; i <= n; i++) 
            {
                if (districtType[1] == districtType[i])
                    System.out.println(firstDifferentIndex + " " + i);
            }
        }
    }
}
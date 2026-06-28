import java.util.*;
public class main 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        long prefix[] = new long[n];
 
        for (int i = 0; i < n; i++) 
        {
            prefix[i] = sc.nextLong();
            if (i > 0)
                prefix[i] += prefix[i - 1];
        }
 
        while (m-- > 0) 
        {
            long letter = sc.nextLong();
 
            int left = 0, right = n - 1;
 
            // Binary search for the first prefix >= letter
            while (left < right) 
            {
                int mid = left + (right - left) / 2;
 
                if (prefix[mid] >= letter)
                    right = mid;
                else
                    left = mid + 1;
            }
 
            int dorm = left + 1;
            long room;
 
            if (left == 0)
                room = letter;
            else
                room = letter - prefix[left - 1];
 
            System.out.println(dorm + " " + room);
        }
    }
}
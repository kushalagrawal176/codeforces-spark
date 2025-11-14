import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // number of elements in the array
            int a[] = new int[n];
            
            int freq[] = new int[101]; // frequency array (since 1 <= ai <= 100)
            
            int odd = 0;   // count of odd numbers
            int even = 0;  // count of even numbers
            
            // Read array elements and count odd/even
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                freq[a[i]]++;
                
                // Check parity of element
                if((a[i]&1) == 1) // odd number
                    odd++;
                else              // even number
                    even++;
            }
            
            // Case 1: If both odd and even counts are even, we can pair them easily
            if((odd&1) == 0 && (even&1) == 0)
                System.out.println("YES");
            else
            {
                // Case 2: Otherwise, check if there exists a pair of numbers
                // differing by exactly 1 (because such pairs can "fix" the parity issue)
                boolean flag = false;
                for(int i=0;i<n;i++)
                {
                    // If a[i]-1 or a[i]+1 exists in the array, then we can form a valid pair
                    if(freq[a[i]-1] > 0 || (a[i]+1 < 101 && freq[a[i]+1] > 0))
                    {
                        flag = true;
                        break;
                    }
                }
                
                // If such a pair exists, answer is YES, else NO
                if(flag == true)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
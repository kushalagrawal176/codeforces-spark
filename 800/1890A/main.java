import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) 
        {
            int n = sc.nextInt(); // size of the array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
            }

            // Use HashMap to count frequency of each element
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int item : arr) 
            {
                freq.put(item, freq.getOrDefault(item, 0) + 1);
            }

            if (freq.size() == 1) 
            {
                // All elements are the same
                System.out.println("Yes");
            } 
            else if (freq.size() == 2) 
            {
                // Two distinct elements
                Iterator<Integer> it = freq.values().iterator();
                int count1 = it.next();
                int count2 = it.next();

                int diff = Math.abs(count1 - count2);

                if (diff <= 1) 
                {
                    System.out.println("Yes");
                } 
                else 
                {
                    System.out.println("No");
                }
            } 
            else 
            {
                // More than two distinct elements
                System.out.println("No");
            }
        }
    }
}

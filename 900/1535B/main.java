import java.util.*;

public class main 
{
    // Function to compute gcd
    public static int gcd(int a, int b) 
    {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static int countGoodPairs(int[] a) 
    {
        int n = a.length;

        // Sort with custom comparator: evens first
        Integer[] arr = Arrays.stream(a).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (x, y) -> {
            return (x % 2 == 0 ? 1 : 0) > (y % 2 == 0 ? 1 : 0) ? -1 : 1;
        });

        int count = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (gcd(arr[i], 2 * arr[j]) > 1) 
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            System.out.println(countGoodPairs(a));
        }
    }
}

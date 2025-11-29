import java.util.*;

public class main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int[] a = new int[n + 1];

            for (int i = 1; i <= n; i++)
                a[i] = sc.nextInt();

            long count = 0;

            // iterate over i
            for (int i = 1; i <= n; i++) {
                int ai = a[i];

                // multiples of ai: ai * k <= 2n
                for (int k = 1; ai * k <= 2 * n; k++) {
                    int j = ai * k - i;

                    // j must be > i and within bounds
                    if (j > i && j <= n) {
                        if (a[j] == k) {
                            count++;
                        }
                    }
                }
            }

            System.out.println(count);
        }
    }
}

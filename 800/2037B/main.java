import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) 
        {
            int k = sc.nextInt();
            int[] arr = new int[k];

            for (int i = 0; i < k; i++)
                arr[i] = sc.nextInt();

            Map<Integer, Integer> mp = new HashMap<>();

            for (int i = 0; i < k; i++)
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

            for (int i = 1; i <= k - 2; i++) 
            {
                if (i * ((k - 2) / i) == (k - 2)) 
                {
                    if (mp.getOrDefault(i, 0) > 0) 
                    {
                        mp.put(i, mp.get(i) - 1);
                        int other = (k - 2) / i;

                        if (mp.getOrDefault(other, 0) > 0) 
                        {
                            System.out.println(i + " " + other);
                            break;
                        }
                    }
                }
            }
        }
    }
}

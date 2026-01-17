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

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) 
            {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }
            int maxFreq = 0;
            for (int v : freq.values()) 
                maxFreq = Math.max(maxFreq, v);
            
            int uniqueSkills = freq.size();
            System.out.println(Math.min(maxFreq, uniqueSkills - 1) > Math.min(uniqueSkills, maxFreq - 1) ? Math.min(maxFreq, uniqueSkills - 1) : Math.min(uniqueSkills, maxFreq - 1));
        }
    }
}
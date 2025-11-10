import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int freq[] = new int[n];
        for(int i=n-1;i>=0;i--)
        {
            mp.put(a[i], 1);
            freq[i] = mp.size();
        }
        
        for(int i=0;i<m;i++)
        {
            int idx = sc.nextInt();
            
            System.out.println(freq[idx-1]);
        }
    }
}
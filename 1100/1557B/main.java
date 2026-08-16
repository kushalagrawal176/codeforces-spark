import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            TreeMap<Integer,Integer> map = new TreeMap<>();
            for(int j=0;j<n;j++)
            {
                int temp = sc.nextInt();
                map.put(temp,j);
            }
 
            int prev = -2;
            int count = 0;
 
            for(Map.Entry<Integer, Integer> en : map.entrySet()) 
            {
                Integer val = en.getValue();
                if(val - prev ==1)
                    count++;
 
                prev = val;
            }
 
            if(count >= n-m)
                System.out.println("Yes");
            else 
                System.out.println("NO");
        }
 
    }
}
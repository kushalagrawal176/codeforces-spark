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
            
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            
            for (int i = 0; i < n; i++) 
                a[i] = sc.nextInt();
            for (int i = 0; i < n; i++) 
                b[i] = sc.nextInt();
            for (int i = 0; i < n; i++) 
                c[i] = sc.nextInt();
            
            List<int[]> topA = getTopThree(a);
            List<int[]> topB = getTopThree(b);
            List<int[]> topC = getTopThree(c);
            
            long maxSum = -1;
            
            for (int[] pa : topA) 
            {
                for (int[] pb : topB) 
                {
                    for (int[] pc : topC) 
                    {
                        int dayA = pa[1];
                        int dayB = pb[1];
                        int dayC = pc[1];
                        
                        if (dayA != dayB && dayA != dayC && dayB != dayC) 
                        {
                            long sum = (long)pa[0] + pb[0] + pc[0];
                            if (sum > maxSum) 
                                maxSum = sum;
                        }
                    }
                }
            }
            
            System.out.println(maxSum);
        }
    }
    
    static List<int[]> getTopThree(int[] arr) 
    {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) 
        {
            list.add(new int[]{arr[i], i});
        }
        
        list.sort((x, y) -> Integer.compare(y[0], x[0]));
        return list.subList(0, Math.min(3, list.size()));
    }
}
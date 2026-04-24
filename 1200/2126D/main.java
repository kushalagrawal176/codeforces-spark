import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            long arr[][] = new long[n][3];
 
            int m = n;
            int i = 0;
 
            while(m-- > 0)
            {
                arr[i][0] = sc.nextLong();
                arr[i][1] = sc.nextLong();
                arr[i][2] = sc.nextLong();
                i++;
            }
 
            Arrays.sort(arr,(a,b)->Long.compare(a[0],b[0]));
            int j = 0;
 
            while(n-- > 0)
            {
                if(arr[j][0] <= k && k <= arr[j][1] && arr[j][2] > k)
                    k=arr[j][2];
 
                j++;
            }
 
            System.out.println(k);
        }
    }
}
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
 
            int ar[] = new int[n];
            int arr[] = new int[m];
 
            for(int i=0;i<n;i++)
                ar[i] = sc.nextInt();
            for(int i=0;i<m;i++)
                arr[i] = sc.nextInt();
 
            Arrays.sort(ar);
            Arrays.sort(arr);
 
            long diff = 0;
            for(int i=0;i<n;i++)
                diff += Math.max(Math.abs(ar[i]-arr[m-i-1]), Math.abs(ar[i]-arr[n-i-1]));
 
            System.out.println(diff);  
        } 
    }
}
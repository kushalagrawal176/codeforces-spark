import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        
        System.out.println(Math.abs(a[0]-a[1]) + " " + Math.abs(a[0]-a[n-1]));
        
        for(int i=1;i<n-1;i++)
        {
            int mini = Math.min(Math.abs(a[i]-a[i-1]), Math.abs(a[i]-a[i+1]));
            int maxi = Math.max(Math.abs(a[i]-a[0]), Math.abs(a[i]-a[n-1]));
            
            System.out.println(mini + " " + maxi);
        }
        
        System.out.println(Math.abs(a[n-1]-a[n-1-1]) + " " + Math.abs(a[0]-a[n-1]));
    }
}

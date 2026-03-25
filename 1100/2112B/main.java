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
 
            int a[] = new int[n];
            for(int i=0;i<n;i++) 
                a[i] = sc.nextInt();
 
            boolean strictlyDecreasing = true;
            boolean strictlyIncreasing = true;
            boolean ans = false;
 
            for(int i=1;i<n;i++)
            {
                if(Math.abs(a[i] - a[i-1]) <= 1) 
                { 
                    ans = true; 
                    break;
                }
 
                if(strictlyDecreasing == true && a[i-1] < a[i])
                    strictlyDecreasing = false;
                if(strictlyIncreasing == true && a[i-1] > a[i])
                    strictlyIncreasing = false;
            }
             
             if(ans == true) 
                System.out.println(0);
             else if(strictlyDecreasing == true || strictlyIncreasing == true)
                System.out.println(-1);
             else 
                System.out.println(1);
        }
    }
}
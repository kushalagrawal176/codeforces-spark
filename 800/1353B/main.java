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
            int k = sc.nextInt();
            
            int a[] = new int[n];
            int b[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            for(int i=0;i<n;i++)
            {
                if(a[i] < b[n-i-1] && k > 0)
                {
                    a[i] = b[n-i-1];
                    k--;
                }
                else
                    break;
            }
            
            int sum = 0;
            for(int i=0;i<n;i++)
                sum += a[i];
            
            System.out.println(sum);
        }
    }
}
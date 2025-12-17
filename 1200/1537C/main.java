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
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            
            int idx1 = -1;
            int diff = 1000000000;
            
            for(int i=0;i<n-1;i++)
            {
                if(diff > a[i+1]-a[i])
                {
                    idx1 = i;
                    diff = a[i+1]-a[i];
                }
            }
            
            System.out.print(a[idx1]+" ");
            for(int i=idx1+2;i<n;i++)
                System.out.print(a[i]+" ");
            for(int i=0;i<idx1;i++)
                System.out.print(a[i]+" ");
            System.out.println(a[idx1+1]);
        }
    }
}
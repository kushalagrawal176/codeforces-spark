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
            int m = (n*(n-1))/2;
            
            int a[] = new int[m];
            for(int i=0;i<m;i++)
                a[i] = sc.nextInt();
            
            Arrays.sort(a);
            for(int i=0;i<m;i+=(--n))
                System.out.print(a[i]+" ");
            
            System.out.println(1000000000);
        }
    }
}
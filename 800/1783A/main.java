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
            
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(a[i] > a[j])
                    {
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
            
            if(a[0] == a[n-1])
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                System.out.print(a[n-1]+" ");
                for(int i=0;i<n-1;i++)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
        }
    }
}
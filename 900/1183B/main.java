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
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
 
            Arrays.sort(a);

            // Check if it's possible to make all elements equal
            if(a[n-1]-k > a[0]+k)
                System.out.println(-1);
            else
                System.out.println(a[0]+k);
        }
    }
}
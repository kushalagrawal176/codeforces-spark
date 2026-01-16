import java.util.*;
 
public class main 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt(), a[] = new int[n], b[] = new int[n];

            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();

            for(int i=0;i<n;i++)
                b[i] = a[i]-sc.nextInt();

            Arrays.sort(b);
            System.out.println(b[0]+b[1] >=0 ? "YES":"NO");
        }
    }
}
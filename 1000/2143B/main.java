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

            long total = 0;

            int a[] = new int[n];
            for(int i=0;i<n;i++)
            {
                a[i] = sc.nextInt();
                total += a[i];
            }

            int b[] = new int[k];
            for(int i=0;i<k;i++)
                b[i] = sc.nextInt();

            Arrays.sort(a);
            Arrays.sort(b);

            int ptr = n-1;

            long free = 0;
            for(int x : b)
            {
                if(ptr+1 < x)
                    break;

                int idx = Math.max(0, ptr-x+1);
                free += a[idx];

                ptr = idx-1;
            }

            System.out.println(total-free);
        }
    }
}
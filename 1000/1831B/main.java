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
            int b[] = new int[n];

            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();

            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();

            int f1[] = new int[2*n+1];
            int f2[] = new int[2*n+1];

            int i = 0;
            while(i < n)
            {
                int val = a[i];
                int cnt = 0;

                while(i < n && val == a[i])
                {
                    cnt++;
                    i++;
                }

                f1[val] = Math.max(cnt, f1[val]);
            }

            i = 0;
            while(i < n)
            {
                int val = b[i];
                int cnt = 0;

                while(i < n && val == b[i])
                {
                    cnt++;
                    i++;
                }

                f2[val] = Math.max(cnt, f2[val]);
            }

            int maxLen = 0;
            for(int j=1;j<2*n+1;j++)
                maxLen = Math.max(maxLen, f1[j] + f2[j]);

            System.out.println(maxLen);
        }
    }
}
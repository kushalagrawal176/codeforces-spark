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
            int m = sc.nextInt();

            int a[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                    a[i][j] = sc.nextInt();
            }

            int maxi = 0;
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int sum = 0;

                    int ti = i;
                    int tj = j;
                    while(ti >= 0 && tj >= 0)
                        sum += a[ti--][tj--];

                    ti = i+1;
                    tj = j+1;
                    while(ti < n && tj < m)
                        sum += a[ti++][tj++];

                    ti = i-1;
                    tj = j+1;
                    while(ti >= 0 && tj < m)
                        sum += a[ti--][tj++];

                    ti = i+1;
                    tj = j-1;
                    while(ti < n && tj >= 0)
                        sum += a[ti++][tj--];

                    maxi = Math.max(maxi, sum);
                }
            }

            System.out.println(maxi);
        }
    }
}
import java.io.*;
import java.util.*;
public class main
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
 
        while(t-- > 0)
        {
            String[] l = br.readLine().split(" ");
            int n = Integer.parseInt(l[0]);
            int k = Integer.parseInt(l[1]);
 
            int[][] v = new int[n][n];
            for(int i=0;i<n;i++)
            {
                String r[] = br.readLine().split(" ");
                for(int j=0;j<n;j++)
                {
                    v[i][j] = Integer.parseInt(r[j]);
                }
            }
 
            int i = 0;
            int j = n-1;
 
            while(i < j)
            {
                int p = 0;
                int q = n-1;
                while(p < n)
                {
                    if(v[i][p] != v[j][q])
                        k--;
                    p++;
                    q--;
 
                    if(k < 0)
                        break;
                }
 
                if(k < 0)
                    break;
 
                i++;
                j--;
            }
 
            if(n > 1 && n%2 == 1)
            {
                int row = n/2;
                int a = 0;
                int b = n-1;
 
                while(a <= b)
                {
                    if(v[row][a] != v[row][b])
                        k--;
                    a++;
                    b--;
                }
            }
 
            if(k >= 0 && k%2 == 0)
                sb.append("YES\n");
            else if(k >= 0 && n%2 == 1)
                sb.append("YES\n");
            else
                sb.append("NO\n");
        }
 
        System.out.print(sb);
    }
}
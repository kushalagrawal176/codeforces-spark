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
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            sc.nextLine();
 
            char a[][] = new char[n][];
            for(int i=0;i<n;i++)
                a[i] = sc.nextLine().toCharArray();
 
            long cost = 0;
            for(int i=0;i<n;i++)
            {
                int j = 0;
                while(j < m)
                {
                    if(a[i][j] == '*')
                    {
                        j++;
                        continue;
                    }
 
                    if(j+1 < m && a[i][j+1] == '.' && y < 2*x)
                    {
                        cost += y;
                        j += 2;
                    }
                    else 
                    {
                        cost += x;
                        j++;
                    }
                }
            }
 
            System.out.println(cost);
        }
    }
}
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
            int x = sc.nextInt();
            int y = sc.nextInt();
 
            if((x == 0 && y == 0) || (x != 0 && y != 0) || (x != 0 && ((n-1)%x != 0)) || (y != 0 && ((n-1)%y != 0)))
                System.out.println(-1);
            else
            {
                int lim = (x!=0) ? x : y;
                int temp = 1;
                int cnt = 0;
 
                for(int i=2;i<=n;i++)
                {
                    if(cnt == lim)
                    {
                        temp = i;
                        cnt = 0;
                    }
 
                    cnt++;
                    System.out.print(temp + " ");
                }
 
                System.out.println();
            }
        }
    }
}
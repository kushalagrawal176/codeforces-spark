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
 
            int max = 0;
            for(int i=0;i<n;i++) 
                max = Math.max(max, sc.nextInt());
 
            for(int i=0;i<m;i++)
            {
                char c = sc.next().charAt(0);
                int l = sc.nextInt();
                int r = sc.nextInt();
 
                if(max >= l && max <= r)
                {
                    if(c == '-') 
                        max--;
                    else 
                        max++;
                }
 
                System.out.print(max + " ");
            }
 
            System.out.println();
        }
    }
}
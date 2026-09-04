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
 
            int a[] = new int[n];
            int c = 0;
 
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<n;j++)
                    a[j] = sc.nextInt();
 
                for(int j=0;j<n;j++)
                {
                    if((a[j]|x) != x)
                        break;
 
                    c |= a[j];
                }
            }
 
            if(c == x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
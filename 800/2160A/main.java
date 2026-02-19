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
            int a[] = new int[101];
            
            for(int i=0;i<n;i++)
                a[sc.nextInt()]++;
            
            int ans = -1;
            for(int i=0;i<101;i++)
            {
                if(a[i] == 0)
                {
                    ans = i;
                    break;
                }
            }
            
            System.out.println(ans);
        }
    }
}
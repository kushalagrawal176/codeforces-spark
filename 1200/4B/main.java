import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int sum = sc.nextInt();
        
        int ans[] = new int[d];
        int maxi = 0;
        int mini = 0;
        
        int a[][] = new int[d][2];
        for(int i=0;i<d;i++)
        {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
            
            ans[i] = a[i][0];
            maxi += a[i][1];
            mini += a[i][0];
        }
        
        if(maxi < sum || mini > sum)
            System.out.println("NO");
        else
        {
            int rem = sum - mini;
            
            for(int i=0;i<d;i++)
            {
                ans[i] += Math.min(rem, a[i][1]-a[i][0]);
                rem -= Math.min(rem, a[i][1]-a[i][0]);
                
                if(rem == 0)
                    break;
            }
            
            System.out.println("YES");
            
            for(int i=0;i<d;i++)
                System.out.print(ans[i] + " ");
            
            System.out.println();
        }
    }
}
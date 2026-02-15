import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int[n];
            
            for(int j=0;j<n;j++)
                a[j] = sc.nextInt();
            
            int ans[] = new int[n];
            Arrays.fill(ans,Integer.MAX_VALUE);
            
            int i = 0;
            int j = 0;
            
            while(j < n)
            {
                if(a[i] == a[j])
                    j++;
                else
                {
                    ans[i] = j+1;
                    i++;
                }
            }
        
            int q = sc.nextInt();
            while(q-- > 0)
            {
                int l = sc.nextInt();
                int r = sc.nextInt();
                
                if(ans[l-1] <= r)
                    System.out.println(l + " " + ans[l-1]);
                else
                    System.out.println(-1 + " " + -1);
            }
        }
    }
}
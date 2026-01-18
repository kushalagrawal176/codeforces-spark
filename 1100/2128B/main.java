import java.util.*;
public class main
{
    public static void main(String []  args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
 
            int [] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
 
            int p = 0;
            String ans = "";
            
            for(int l=0,r=n-1;l<r;l++,r--)
            {
                if(p%2==0)
                    ans+=(arr[l]>arr[r] ? "LR" : "RL");
                else
                    ans+=(arr[l]>arr[r] ? "RL" : "LR");
                p++;
            }
 
 
            if((n&1)==1)
                ans += 'L';
 
            System.out.println(ans);
        }
    }
}
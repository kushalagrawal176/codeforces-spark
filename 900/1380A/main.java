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
            int arr[] = new int[n];
            
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            
            int ans = -1;
            for(int i=1;i<n-1;i++)
            {
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
                {
                    ans = i+1;
                    break;
                }
            }
            
            if(ans == -1)
                System.out.println("NO");
            else
            {
                System.out.println("YES");
                System.out.println((ans-1) + " " + ans + " " + (ans+1));
            }
        }
    }
}
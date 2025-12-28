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
            int a[] = new int[n];
            
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
            
            int mini = a[n-1];
            
            int cnt = 0;
            for(int i=n-1;i>=0;i--)
            {
                if(mini < a[i])
                    cnt++;
                else
                    mini = a[i];
            }
            
            System.out.println(cnt);
        }
    }
}
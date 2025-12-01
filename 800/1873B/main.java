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
            int prod = 1;
            
            int a[] = new int[10];
            for(int i=0;i<n;i++)
            {
                int num = sc.nextInt();
                a[num]++;
                prod = prod * num;
            }
            
            int maxi = 1;
            if(a[0] >= 2)
                maxi = 0;
            else if(a[0] == 1)
            {
                for(int i=1;i<=9;i++)
                {
                    if(a[i] > 0)
                        maxi = maxi*(int)Math.pow(i, a[i]);
                }
            }
            else
            {
                for(int i=1;i<=9;i++)
                {
                    if(a[i] > 0)
                        maxi = Math.max(maxi, (prod/i) * (i+1));
                }
            }
            
            System.out.println(maxi);
        }
    }
}
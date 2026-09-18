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
 
            int count0 = 0;
            int count1 = 0;
 
            for(int i = 0; i < n; i++)
            {
                a[i] = sc.nextInt();
                if(a[i]==1) 
                    count1++;
                if(a[i]==0) 
                    count0++;
            } 
 
            if(count0 <= (n-count0)+1)
                System.out.println(0);
            else if(count1==0 || (n-count0-count1)>=1)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}
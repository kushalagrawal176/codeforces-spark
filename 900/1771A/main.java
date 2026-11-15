import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a[] = new int [n];
 
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();
 
            Arrays.sort(a);
 
            long min = 0;
            long max = 0;
 
            for(int i=0;i<n;i++)
            {
                if(a[i] == a[0])
                    min++;
                else if(a[i] == a[n-1])
                    max++;
            }
 
            if(min == n)
                System.out.println(min*(min-1));
            else
                System.out.println((min*max)*2);
        }
    }
}
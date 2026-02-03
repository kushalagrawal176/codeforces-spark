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
            String s = sc.next();
            
            long a[] = new long[n];
            
            long sum = 0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == 'L')
                {
                    sum += i;
                    a[i] = (n-1-i) - i;
                }
                else
                {
                    sum += n-1-i;
                    a[i] = i - (n-1-i);
                }
            }
            
            Arrays.sort(a);
            for(int i=n-1;i>=0;i--)
            {
                if(a[i] > 0)
                    sum += a[i];
                
                System.out.print(sum+" ");
            }
            
            System.out.println();
        }
    }
}
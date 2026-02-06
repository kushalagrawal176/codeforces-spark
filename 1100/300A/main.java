import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int pos[] = new int[t]; // to store positive numbers
        int neg[] = new int[t]; // to store negative numbers
        
        int p = 0;
        int n = 0;
        int zero = 0;
        
        for(int i=0;i<t;i++)
        {
            int a = sc.nextInt();
            
            if(a > 0)
            {
                pos[p] = a;
                p++;
            }
            else if(a < 0)
            {
                neg[n] = a;
                n++;
            }
            else
                zero++;
        }
        
        System.out.println(1 + " " + neg[--n]);
        
        if(p > 0)
        {
            System.out.println(1 + " " + pos[--p]);
            System.out.print(t-2 + " ");
        }
        else
        {
            System.out.println(2 + " " + neg[--n] + " " + neg[--n]);
            
            if(t-3 > 0)
                System.out.print(t-3 + " ");
        }
        
        while(zero-- > 0)
            System.out.print(0 + " ");
        
        while(p-- > 0)
            System.out.print(pos[p] + " ");
        
        while(n-- > 0)
            System.out.print(neg[n] + " ");
    }
}
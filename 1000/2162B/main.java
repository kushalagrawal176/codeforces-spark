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
            
            int len = 0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '0')
                    len++;
            }
            
            System.out.println(len);
            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == '0')
                    System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}
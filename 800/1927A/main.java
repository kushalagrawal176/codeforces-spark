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
            
            int index1 = -1;
            int index2 = -1;
            
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i) == 'B')
                {
                    if(index1 == -1)
                        index1 = i;
                    else
                        index2 = i;
                }
            }
            
            if(index2 == -1)
                System.out.println(1);
            else
                System.out.println(index2-index1+1);
        }
    }
}
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int x = sc.nextInt();
            int k = sc.nextInt();
            
            if(x%k == 0)
                System.out.println(2+"\n"+(x-1)+" "+1);
            else
                System.out.println(1+"\n"+x);
        }
    }
}
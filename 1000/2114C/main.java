import java.util.*;
public class main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int curr = sc.nextInt(), count = 0;
            
            for(int i=1;i<n;i++)
            {
                int x = sc.nextInt();
 
                if(x-curr>1)
                {
                    count++; 
                    curr = x;
                }
            }
 
            System.out.println(count+1);
        }
    }
}
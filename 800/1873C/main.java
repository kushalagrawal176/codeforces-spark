import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int cnt = 0;
            for(int i=1;i<=10;i++)
            {
                String s = sc.next();
                for(int j=1;j<=10;j++)
                {
                    if(s.charAt(j-1) == 'X')
                    {
                        int x = Math.min(i, 10-i+1);
                        int y = Math.min(j, 10-j+1);
                        
                        cnt += Math.min(x,y);
                    }
                }
            }
            
            System.out.println(cnt);
        }
    }
}
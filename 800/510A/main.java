import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int dir = 1;
        
        for(int i=1;i<=n;i++)
        {
            String s = "";
            if(i%2 == 0)
            {
                for(int j=1;j<m-1;j++)
                    s = s + '.';
                if(dir == 1)
                    s ='.' + s + '#';
                else
                    s = '#' + s + '.';
                
                dir = dir ^ 0 ^ 1;
            }
            else
            {
                for(int j=0;j<m;j++)
                    s = s + '#';
            }
            System.out.println(s);
        }
    }
}
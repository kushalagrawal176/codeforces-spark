import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        {
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int d = sc.nextInt();
                int e = sc.nextInt();
                int f = sc.nextInt();
                
                int ans = 0;
                
                int pos[][] = {{a,b},{a,-b},{-a,b},{-a,-b},{b,a},{b,-a},{-b,a},{-b,-a}};
                for(int i=0;i<8;i++)
                {
                    for(int j=0;j<8;j++)
                    {
                        if(c+pos[i][0]+pos[j][0] == e && d+pos[i][1]+pos[j][1] == f)
                            ans++;
                    }
                }
                
                if(a == b)
                    ans = ans/4;
                
                System.out.println(ans);
            }
        }
    }
}
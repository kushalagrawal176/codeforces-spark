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
            String a = sc.next();
            String b = sc.next();
            
            char ch[] = a.toCharArray();
            
            int cnt = 0;
            for(int i=0;i<n;i++)
            {
                if(b.charAt(i) == '1')
                {
                    if(ch[i] == '0')
                        cnt++;
                    else if(i-1 >= 0 && ch[i-1] == '1')
                    {
                        cnt++;
                        ch[i-1] = '2';
                    }
                    else if(i+1 < n && ch[i+1] == '1')
                    {
                        cnt++;
                        ch[i+1] = '2';
                    }
                    else
                    {}
                }
            }
            
            System.out.println(cnt);
        }
    }
}
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        
        while(w-- > 0)
        {
            String s = sc.next();
            
            int cnt = s.length()+1;
            for(int i=s.length()-1;i>=0;i--)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if((((s.charAt(j)-'0') * 10) + (s.charAt(i)-'0'))%25 == 0)
                        cnt = Math.min(cnt, s.length()-j-2);
                }
            }
            
            System.out.println(cnt);
        }
    }
}
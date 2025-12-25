import java.util.*;
public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next();
            int res = 0, cnt = 0;
			for (int i = 0; i < s.length() - 1; ++i) 
			{
				if (s.charAt(i) == '1' && s.charAt(i + 1) == '0') 
				    res++;
				if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') 
				    cnt++;
			}
				
			System.out.println(res + Math.max(cnt, 1));
        }
    }
}
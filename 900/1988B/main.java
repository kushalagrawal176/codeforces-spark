import java.util.*;
public class Main
{
    public static void main(String args[]) 
    {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0) 
        {
			int n = sc.nextInt();
			String s = sc.next();
 
			int n1 = 0;
			int n0 = 0;
 
			boolean b = true;
			for(int i=0;i<s.length();i++) 
            {
				if(s.charAt(i) == '1') 
                {
					n1++;
					b = true;
				}
				else if(s.charAt(i) == '0' && b) 
                {
					n0++;
					b = false;
				}
			}
 
			if(n1 > n0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
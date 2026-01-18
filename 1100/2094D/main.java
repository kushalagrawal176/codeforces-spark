import java.util.*;
public class main 
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0)
		{
			String p = sc.next();
			String s = sc.next();
			
			boolean res = true;
 
			int i = 0;
			int j = 0;
			char ch = p.charAt(0);
			
			while(i < p.length() && j < s.length())
			{
				int temp = 0;
				while(i < p.length() && p.charAt(i) == ch)
				{
					temp++;
					i++;
				}
 
				int temp2 = 0;
				while(j < s.length() && s.charAt(j) == ch)
				{
					temp2++;
					j++;
				}
 
				if(temp2 < temp || temp2 > (temp*2))
				{
					res = false;
					break;
				}
 
				if(ch == 'L')
					ch = 'R';
				else
					ch = 'L';
			}
 
			if(i != p.length() || j != s.length())
				res = false;
 
			if(res)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
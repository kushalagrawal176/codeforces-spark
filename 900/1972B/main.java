import java.util.*;
 
public class main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while (t-- > 0)
		{
			int n = sc.nextInt();
			String s = sc.next();
			
			s = s.replace("D", "");
			
			System.out.println(s.length() % 2 == 0 ? "NO" : "YES");
		}
	}
}
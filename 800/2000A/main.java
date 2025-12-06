import java.util.*;
public class main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int a = sc.nextInt();
			if((a>101 && a<110)|| (a>1009 && a<1100))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
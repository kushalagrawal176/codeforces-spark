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
 
			if(n == 3)
				System.out.print("NO");
			else if(n%2 == 0)
			{
				System.out.println("YES");
 
				for(int i=1; i<=n; i++)
				{
					if(i%2 != 0)
						System.out.print(-1+" ");
					else
						System.out.print(1+" ");
				}
			}
			else
			{
				System.out.println("YES");
 
				int x = n/2;
				int y = x-1;
 
				for(int i=1; i<=n; i++)
				{
					if(i%2 != 0)
						System.out.print(y+" ");
					else
						System.out.print(-x+" ");
				}
			}
 
			System.out.println();
		}
	} 
}
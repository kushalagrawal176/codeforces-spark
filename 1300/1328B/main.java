import java.util.*;
public class main 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while (t-- > 0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			int index = 1;
			while (k > index) 
			{
				k -= index;
				index++;
			}
			
			index++;
			for (int i = n; i >= 1; i--)
			{
				if (i == index || k == i)
					System.out.print("b");
				else
					System.out.print("a");
			}
			
			System.out.println();
		}
	}
}
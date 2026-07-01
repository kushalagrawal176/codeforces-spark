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
 
			for(int i=0; i<n; i++) 
			{
				String s = " ";
				for(int j=0; j<n; j++)
					s += (i+j) % 2 == 0 ? "##" : "..";
 
				System.out.println(s);
				System.out.println(s);
			}
		}
	}
}
import java.util.*;
public class main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0;i<t;i++) 
		{
			String str = "";
			int k = sc.nextInt();
			long x = sc.nextLong();
			
			long y = (long)Math.pow(2,k+1) - x;
			int count = 0;
			
			while(x != y) 
			{
				count++;
				
				if(Math.min(x, y) == x) 
				{
				    str = 1 + " " + str;
				    y -= x;
				    x *= 2;
				}
				else 
				{
					str = 2 + " " + str;
					x -= y;
					y *= 2;
				}
			}
			
			System.out.println(count + "\n" + str);
		}
    }
}
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
            int k = sc.nextInt();
 
			int p = -1, z = 0;
 
			while(n-- > 0)
            {
				int a = sc.nextInt();
                int b = sc.nextInt();
 
				if(a == k) 
                    p = 1;
				if(b == k) 
                    z = 1;
			}
 
		    if(p == 1 && z == 1) 
                System.out.println("YES");
			else 
                System.out.println("NO");
		}
	}
}
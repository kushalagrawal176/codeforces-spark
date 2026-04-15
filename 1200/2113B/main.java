import java.util.*;
public class main
{
	public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
 
		while(t-- > 0)
		{
		    int w = sc.nextInt();
		    int h = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
 
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
 
		    if((x1 != x2 && (x2-x1)%a == 0) || (y1 != y2 && (y2-y1)%b == 0))
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
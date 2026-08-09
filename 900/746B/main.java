import java.util.*;
public class main
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		String s = sc.next();
 
		String a = "";
		a += s.charAt(0);
 
		for(int i=1;i<n;i++)
		{
		    if((n-i)%2 == 0)
		        a = s.charAt(i) + a;
		    else
		        a = a + s.charAt(i);
		}
 
		System.out.println(a);
	}
}
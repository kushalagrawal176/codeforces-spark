import java.util.*;
public class main
{
    public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
 
		String a = sc.next();
		int n = a.length();
 
		int count = (1<<n)-2;
		int c = 0;
 
		for(int i=n-1;i>=0;i--)
		{
		    if(a.charAt(i) == '7')
		        c += (1<<(n-i-1));
		}
 
		System.out.print(count+c+1);
	}
}
import java.util.*;
public class main
{
	public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
 
		int n = sc.nextInt();
		int d = sc.nextInt();
 
		int sum = 0;
		for(int i=0;i<n;i++)
		    sum += sc.nextInt();
 
		if(sum + 10*(n-1) > d)
		    System.out.println(-1);
		else
		    System.out.println(((d-sum)/5));
	}
}

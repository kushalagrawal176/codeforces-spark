import java.util.*;
public class main
{
	public static void main(String args[]) 
    {
    	Scanner sc = new Scanner(System.in);

    	int t = sc.nextInt();
        int a = Integer.MAX_VALUE;
    	boolean f = false, f2 = true;

    	while(t-- > 0) 
        {
    		int x = sc.nextInt(), y = sc.nextInt();

    		if(a < x)
    			f = true;
    		if(x != y)
    			f2 = false;
    		a = Math.max(x, y);
    	}

    	if(!f2)
    		System.out.println("rated");
    	else if(f)
    		System.out.println("unrated");
    	else
    		System.out.println("maybe");
	}
}
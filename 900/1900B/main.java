import java.util.*; 
public class main
{
	public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	while(t-- > 0)
        {
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
 
    		int p = 0;
            int q = 0;
            int r = 0;
 
    		if((b-c)%2 == 0)
                p = 1;
    		if((c-a)%2 == 0)
                q = 1;
    		if((a-b)%2 == 0)
                r = 1;	
 
    		System.out.println(p+" "+q+" "+r+" ");	
    	}
    }
}
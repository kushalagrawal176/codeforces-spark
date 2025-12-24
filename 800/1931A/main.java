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
            
            if(n <= 28) 
                System.out.println("aa" + (char)(n - 3 + 'a'));
		    else if(n >= 29 && n <= 53) 
		        System.out.println("a" + (char)(n - 28 + 'a') + "z");
		    else 
		        System.out.println((char)(n - 53 + 'a') + "zz");
        }
    }
}
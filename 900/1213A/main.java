import java.util.*; 
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int odd = 0;
        int even = 0;
 
        while(n-- > 0) 
        {
            int x = sc.nextInt();
 
            if(x%2 == 0) 
                even++;
            else 
                odd++;
        }
 
        System.out.println(Math.min(odd, even));
    }
}
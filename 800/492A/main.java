import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int l = 0;
        while((l+1)*(l+2)*(l+3)/6 <= n) 
            l++;
        
        System.out.println(l);
    }
}
import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int cnt = n/2;
        System.out.println(cnt);
        
        for(int i=1;i<cnt;i++)
            System.out.print(2+" ");
        
        if(n%2 == 1)
            System.out.println(3);
        else
            System.out.println(2);
    }
}
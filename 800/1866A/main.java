import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int mini = Math.abs(sc.nextInt());
        for(int i=1;i<n;i++)
            mini = Math.min(mini, Math.abs(sc.nextInt()));
        
        System.out.println(mini);
    }
}

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
            int k = sc.nextInt();
            
            if(n%2 == 1)
                System.out.println(n/2+" "+n/2+" "+1);
            else
            {
                if(n%4 == 0)
                    System.out.println(n/2+" "+n/4+" "+n/4);
                else
                {
                    int num1=(n/2)-1;
                    System.out.println(num1+" "+num1+" "+2);
                }
            }
        }
    }
}
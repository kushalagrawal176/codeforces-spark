import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t>0)
        {
            int n = sc.nextInt();
            int a = sc.nextInt();
            
            int max = a;
            int min = a;
            
            String output = "YES";
            
            for(int i=1;i<n;i++)
            {
                a = sc.nextInt();
                
                if(a == max+1)
                    max++;
                else if(a == min-1)
                    min--;
                else
                    output = "NO";
            }
            
            System.out.println(output);
            t--;
        }
    }
}
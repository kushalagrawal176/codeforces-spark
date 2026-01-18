import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while(t --> 0) 
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            
            int one = 0;
            int i = -1;
            
            while(++i < n) 
                arr[i] = sc.nextInt();
                
            boolean first = true;
            i = -1;
            
            while(++i < n) 
            {
                if(arr[i] == 1) 
                    first = !first;
                else 
                {
                    first = !first;
                    break;
                }
            }
            
            if(!first) 
                System.out.println("First");
            else 
                System.out.println("Second");
        }
    }
}
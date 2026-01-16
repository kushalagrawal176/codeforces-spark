import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        
        int taxi = 0;
        
        for(int i=0;i<n;i++)
        {
            int t = sc.nextInt();
            
            if(t == 1)
                one++;
            else if(t == 2)
                two++;
            else if(t == 3)
                three++;
            else
                four++;
        }
        
        taxi = four + three + (two+1)/2;
        one = one-three;
        
        if (two % 2 > 0) 
            one -= 2;  
        if (one > 0) taxi += (one + 3) / 4;  
            
        System.out.println(taxi);
    }
}
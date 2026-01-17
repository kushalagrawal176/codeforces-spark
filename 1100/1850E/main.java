import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            double n = sc.nextDouble();
            double c = sc.nextDouble();
            
            double sum = 0;
            double sum_square = 0;
            
            for(double i=0;i<n;i++)
            {
                double a = sc.nextDouble();
                
                sum += a;
                sum_square += a*a;
            }
            
            double w1 = ((-4)*(sum) + Math.sqrt(Math.pow(4*sum, 2) + 16*n*(c-sum_square)))/(8*n) + 0.5;
        
            System.out.println((long)Math.floor(w1));
        }
    }
}
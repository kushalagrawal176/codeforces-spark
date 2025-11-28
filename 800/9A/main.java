import java.util.*;
 
public class main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        int Y = sc.nextInt();
        int W = sc.nextInt();
 
        String[] probability = {"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
        int d = Math.max(Y, W);
 
        System.out.println(probability[d]);
    }
}
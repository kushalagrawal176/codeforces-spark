import java.util.*;

public class main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Integer.bitCount() gives the number of set bits (1s) in binary representation
        System.out.println(Integer.bitCount(n));
    }
}

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        String a[] = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        
        while(n > 5)
            n = n/2 - 2;

        System.out.println(a[n-1]);
    }
}
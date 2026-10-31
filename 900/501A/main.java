import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
 
        int vasya = Math.max(3*a/10, a-a/250*c);
        int misha = Math.max(3*b/10, b-b/250*d);
 
        System.out.println(vasya < misha ? "Vasya" : vasya > misha ? "Misha":"Tie");
    }
}
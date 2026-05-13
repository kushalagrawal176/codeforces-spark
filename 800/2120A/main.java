import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while(t-- > 0)
        {
            int l1 = sc.nextInt(), b1=sc.nextInt();
 
            int l2 = sc.nextInt(), b2=sc.nextInt();
 
            int l3 = sc.nextInt(), b3=sc.nextInt();
            boolean b = false;
 
            if(l1==l2 && l2==l3 && (b1+b2+b3==l1))
                b = true;
            if(b1==b2 && b2==b3 && (l1+l2+l3==b1))
                b = true;
            if(l1==l2+l3 && b2==b3 && (b1+b2==l1))
                b = true;
            if(b1==b2+b3 && l2==l3 && (l1+l2==b1))
                b = true;
 
            System.out.println(b? "YES":"NO");
        }
    }
}
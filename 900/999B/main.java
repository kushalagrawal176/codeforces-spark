import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        char s[] = sc.next().toCharArray();
 
        for(int d=2;d<=n;d++)
        {
            if(n%d != 0)
                continue;
 
            for(int i=0;i<d/2;i++)
            {
                char ch = s[i];
                s[i] = s[d-i-1];
                s[d-i-1] = ch;
            }
        }
 
        for(int i=0;i<n;i++)
            System.out.print(s[i]);
    }
}
import java.util.*;
public class main
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0) 
        {
            String s = sc.next();
            int flag = 0;

            for(int i=0; i<8; i++) 
            {
                int sum = 0;
                boolean valid = true;

                for(int j=0; j<s.length(); j++) 
                {
                    char c = s.charAt(j);
                    // (i >> (c - 'A')) & 1
                    int bit = (i >> (c - 'A')) & 1;
                    sum += (bit == 1) ? 1 : -1;

                    if(sum < 0) 
                    {
                        valid = false;
                        break;
                    }
                }

                if(valid && sum == 0) 
                {
                    System.out.println("YES");
                    flag = 1;
                    break;
                }
            }

            if(flag == 0)
                System.out.println("NO");
        }
    }
}
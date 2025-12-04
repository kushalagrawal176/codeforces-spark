import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            char[] s = st.toCharArray();
            
            for(int i=0;i<st.length()/2;i++)
            {
                char ch = s[i];
                s[i] = s[st.length()-1-i];
                s[st.length()-1-i] = ch;
            }
            
            for(int i=0;i<st.length();i++)
            {
                if(s[i] == 'p')
                    s[i] = 'q';
                else if(s[i] == 'q')
                    s[i] = 'p';
                else
                {}
            }
            
            System.out.println(String.valueOf(s));
        }
    }
}
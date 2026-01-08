import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();
            
            int cnt = 0;
            
            for(int i=0;i<n-2;i++)
            {
                String st = "";
                st = st + s.charAt(i);
                st = st + s.charAt(i+1);
                st = st + s.charAt(i+2);
                
                if(st.compareTo("pie") == 0)
                {
                    cnt++;
                    i = i + 2;
                }
                if(st.compareTo("map") == 0)
                {
                    cnt++;
                    i = i + 2;
                }
            }
            
            System.out.println(cnt);
        }
    }
}
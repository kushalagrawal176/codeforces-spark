import java.util.*;
 
public class main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) 
        {
            int n = sc.nextInt();
            int q = sc.nextInt();
 
            String a = sc.next();
            String b = sc.next();
 
            int[][] mp1 = new int[n][26];
            int[][] mp2 = new int[n][26];
 
            mp1[0][a.charAt(0) - 'a']++;
            mp2[0][b.charAt(0) - 'a']++;
 
            for (int i = 1; i < n; i++) 
            {
                for (int c = 0; c < 26; c++) 
                {
                    mp1[i][c] = mp1[i - 1][c];
                    mp2[i][c] = mp2[i - 1][c];
                }
                
                mp1[i][a.charAt(i) - 'a']++;
                mp2[i][b.charAt(i) - 'a']++;
            }
 
            while (q-- > 0) 
            {
                int l = sc.nextInt() - 1;
                int r = sc.nextInt() - 1;
 
                int cnt = 0;
 
                for (int i = 0; i < 26; i++) 
                {
                    int f1, f2;
                    if (l > 0) 
                    {
                        f1 = mp1[r][i] - mp1[l - 1][i];
                        f2 = mp2[r][i] - mp2[l - 1][i];
                    } 
                    else 
                    {
                        f1 = mp1[r][i];
                        f2 = mp2[r][i];
                    }
                    
                    cnt += Math.abs(f1 - f2);
                }
 
                System.out.println(cnt/2);
            }
        }
    }
}
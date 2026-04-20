import java.util.*;
import java.io.*;

public class main
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine());
            long ans = 0;
 
            for(int i=0;i<n;i++)
            {
                String arr[] = br.readLine().split(" ");
 
                long a = Long.parseLong(arr[0]);
                long b = Long.parseLong(arr[1]);
                long c = Long.parseLong(arr[2]);
                long d = Long.parseLong(arr[3]);
 
                if(b > d)
                    ans += a+b-d;
                else if(a > c)
                    ans += a-c;
            }
 
            bw.write(ans+"\n");
        }

        bw.flush();
        bw.close();
    }
}
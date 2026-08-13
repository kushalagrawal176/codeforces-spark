import java.util.*;
public class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        while(n-- > 0)
        {
            int n1 = sc.nextInt();
            int sleeph = sc.nextInt();
            int sleepm = sc.nextInt();
 
            int current = sleeph*60+sleepm;
            int minwait = Integer.MAX_VALUE;
 
            while(n1-- > 0)
            {
                int alarmhour = sc.nextInt();
                int alarmmin = sc.nextInt();
                int alarm = alarmhour*60+alarmmin;
                int wait;
 
                if(alarm >= current)
                    wait = alarm-current;
                else
                    wait = (1440-current)+alarm;
 
                minwait = Math.min(wait,minwait);
            }
 
            System.out.println(minwait/60+" "+minwait%60);
        }
    }
}
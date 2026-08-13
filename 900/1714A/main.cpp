#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int n;
    cin>>n;

    while(n-- > 0) 
    {
        int n1, sleeph, sleepm;
        cin >> n1 >> sleeph >> sleepm;

        int current = sleeph * 60 + sleepm;
        int minwait = INT_MAX;

        while(n1-- > 0) 
        {
            int alarmhour, alarmmin;
            cin >> alarmhour >> alarmmin;
            int alarm = alarmhour * 60 + alarmmin;
            int wait;

            if(alarm >= current)
                wait = alarm - current;
            else
                wait = (1440 - current) + alarm;

            minwait = min(wait, minwait);
        }

        cout << minwait / 60 << " " << minwait % 60 << "\n";
    }

    return 0;
}
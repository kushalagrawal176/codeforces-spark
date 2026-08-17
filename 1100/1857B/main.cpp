#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        string str;
        cin >> str;

        str = '0' + str;
        int len = str.length();

        for(int i = len - 1; i >= 0; i--) 
        {
            if(str[i] >= '5') 
            {
                str[i - 1]++;
                len = i;
            }
        }

        int start = (str[0] == '0' ? 1 : 0);
        for (int i = start; i < str.length(); i++) 
        {
            if (i < len)
                cout << str[i];
            else
                cout << '0';
        }
        cout << "\n";
    }

    return 0;
}
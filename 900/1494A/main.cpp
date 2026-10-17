#include<bits/stdc++.h> 
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        string s;
        cin>>s;

        int flag = 0;

        for(int i=0;i<8;i++)
        {
            int sum = 0;
            for(int j=0;s[j];j++)
            {
                sum += (i>>s[j]-'A')&1 ? 1:-1;
                if(sum < 0)
                    break;
            }

            if(sum == 0)
            {
                cout<<"YES"<<endl;
                flag = 1;
                break;
            }
        }

        if(!flag)
            cout<<"NO"<<endl;
    }

    return 0;
}
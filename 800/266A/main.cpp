#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n;
    cin>>n;

    string s;
    cin>>s;
    
    int cnt = 0;
    for(int i=0;i<n;)
    {
        int j = i+1;
        while(j<n && s[j]==s[i])
        {
            cnt++;
            j++;
        }
        i = j;
    }
    cout<<cnt<<endl;
    return 0;
}
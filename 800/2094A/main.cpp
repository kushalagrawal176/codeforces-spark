#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        string s1;
        string s2;
        string s3;
        cin>>s1;
        cin>>s2;
        cin>>s3;
        
        string temp = "";
        temp += s1[0];
        temp += s2[0];
        temp += s3[0];

        cout<<temp<<endl;
    }
    
    return 0;
}
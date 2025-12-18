#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        int n;
        cin>>n;
        
        int x = 0;
        string s = "Sakurako";
        x = -1;
        int i = 2;
        
        while(x>=-n && x<=n)
        {
            if(s == "Sakurako")
            {
                s = "Kosuke";
                x = x + 2*i - 1;
            }
            else
            {
                s = "Sakurako";
                x = x - 2*i + 1;
            }
            i++;
        }
        
        cout<<s<<endl;
    }
    return 0;
}
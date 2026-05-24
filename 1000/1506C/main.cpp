#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t-- > 0)
    {
        string a;
        string b;

        cin>>a>>b;

        int lenA = a.length();
        int lenB = b.length();

        unordered_map<string, int> prefix;
        int operations = INT_MAX;

        for(int i=0;i<lenA;i++)
        {
            string c = "";
            for(int j=i;j<lenA;j++)
            {
                c += a[j];
                prefix[c]++;
            }
        }

        for(int i=0;i<lenB;i++)
        {
            string c = "";
            for(int j=i;j<lenB;j++)
            {
                c += b[j];

                if(prefix.count(c))
                {
                    operations = min(operations, (lenA-(int)c.length()) + (lenB-(int)c.length()));
                }
            }
        }

        cout<<((operations == INT_MAX) ? (lenA+lenB) : operations)<<endl;
    }

    return 0;
}
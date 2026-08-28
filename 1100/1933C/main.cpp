#include<bits/stdc++.h>
using namespace std;

int main() 
{
    int t;
    cin>>t;

    while(t--) 
    {
        long long a, b, l;
        cin>>a>>b>>l;

        set<long long> s1;
        long long p_a = 1;

        for(int i=0; ; i++) 
        {
            if(l%p_a == 0) 
            {
                long long temp_l = l / p_a;
                long long p_b = 1;

                for(int j=0; ; j++) 
                {
                    if(temp_l % p_b == 0)
                        s1.insert(temp_l / p_b);
                    else
                        break;

                    if(temp_l / b < p_b) 
                        break;
                    p_b *= b;
                }
            }

            if(l/a < p_a) 
                break;

            p_a *= a;
        }

        cout<<s1.size()<<"\n";
    }

    return 0;
}
#include<iostream>
#include<string>
using namespace std;
 
int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
        string n;
        cin>>n;
        
        if(n.length()>10)
        {
            int len = n.length()-2;
            char a = n[0];
            char b = n[n.length()-1];
            
            n = "";
            n = a+to_string(len)+b;
            cout<<n<<endl;
        }
        else
            cout<<n<<endl;;
    }
    return 0;
}
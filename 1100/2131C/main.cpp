#include<bits/stdc++.h>
using namespace std;
 
int main() 
{
    int t;
    cin>>t;
 
    while(t--)
    {
    	int n,k;
    	cin>>n>>k;
 
    	map<int,int> s,p;
 
    	for(int i=0;i<n;i++)
    	{
    	    int a;
    	    cin>>a;
 
    	    s[a%k]++;
    	    s[k-a%k]++;
    	}
 
    	for(int i=0;i<n;i++)
    	{
    	    int a;
    	    cin>>a;
 
    	    p[a%k]++;
    	    p[k-a%k]++;
    	}
 
    	if(p == s) 
    	    cout<<"YES"<<endl;
    	else 
    	    cout<<"NO"<<endl;
    }
}
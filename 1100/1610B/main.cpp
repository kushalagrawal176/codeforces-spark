#include<bits/stdc++.h>
using namespace std;

// Function to check if the array becomes a palindrome after removing all occurrences of 'val'
bool check(const vector<int>& arr, int val) 
{
    int i = 0;
    int j = (int)arr.size() - 1;
    
    while(i < j) 
    {
        if (arr[i] == val)
            i++;
        else if (arr[j] == val)
            j--;
        else if (arr[i] != arr[j])
            return false;
        else 
        {
            i++;
            j--;
        }
    }

    return true;
}

int main() 
{    
    int t;
    cin>>t;
    
    while(t--) 
    {
        int n;
        cin>>n;
        
        vector<int> arr(n);
        for(int i = 0; i < n; i++)
            cin>>arr[i];

        bool flag = true;
        for (int i = 0; i < n / 2; i++) 
        {
            if (arr[i] != arr[n - i - 1]) 
            {
                // If elements don't match, try removing either arr[i] or arr[n - i - 1]
                flag = check(arr, arr[i]) || check(arr, arr[n - i - 1]);
                break;
            }
        }
        
        cout << (flag ? "YES\n" : "NO\n");
    }
    
    return 0;
}
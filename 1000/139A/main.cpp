#include <iostream>
using namespace std;

int main() {
    int pages;
    cin >> pages;

    int days[7];
    int sum = 0;
    for(int i = 0; i < 7; i++) 
    {
        cin >> days[i];
        sum += days[i];
    }

    pages = pages % sum;
    if(pages == 0)
        pages = sum;

    int ans = 0;
    int i = 0;
    while(true) 
    {
        if(pages <= days[i]) 
        {
            ans = i + 1;
            break;
        }
        
        pages -= days[i];
        i = (i + 1) % 7;
    }

    cout << ans << endl;
    return 0;
}

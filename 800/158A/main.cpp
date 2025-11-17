#include <iostream>
using namespace std;

int main() {
    int n, k;
    cin >> n >> k;   // number of participants and position k
    
    int scores[n];
    for (int i = 0; i < n; i++) {
        cin >> scores[i];
    }
    
    int cutoff = scores[k - 1];  // score of the k-th participant
    int count = 0;
    
    for (int i = 0; i < n; i++) {
        if (scores[i] >= cutoff && scores[i] > 0) {
            count++;
        }
    }
    
    cout << count << endl;
    return 0;
}

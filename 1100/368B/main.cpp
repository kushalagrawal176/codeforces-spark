#include <iostream>
#include <vector>
#include <algorithm>
#include <unordered_set>
using namespace std;

int main() {
    int n, m;
    cin >> n >> m;

    vector<int> a(n);
    for (int i = 0; i < n; i++)
        cin >> a[i];

    unordered_set<int> st;
    vector<int> freq(n);

    for (int i = n - 1; i >= 0; i--) {
        st.insert(a[i]);
        freq[i] = st.size();
    }

    for (int i = 0; i < m; i++) {
        int idx;
        cin >> idx;
        cout << freq[idx - 1] << "\n";
    }

    return 0;
}

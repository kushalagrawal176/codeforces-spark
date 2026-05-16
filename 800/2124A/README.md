# Problem Number - 2124A Deranged Deletions

**Problem Link:** [https://codeforces.com/problemset/problem/2124/A](https://codeforces.com/problemset/problem/2124/A)

---

## Topics
- Greedy
- Sortings
- Implementation

---

## Constraints
- 1 ≤ `t` ≤ 100  
- 1 ≤ `n` ≤ 100  
- 1 ≤ `a[i]` ≤ `n`  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach
- The problem asks us to determine if there exists an array of any length that forms **derangement** after performing deletion any number of times from initial array.
- If the entire array is non-decreasing, the answer is **"NO"**.
- Otherwise, we can simply find the first pair `(a[i], a[i+1])` such that `a[i] > a[i+1]`.
- This pair itself forms the required array and satisfies **derangement** condition.
- Thus, the solution boils down to scanning the array once and checking for the first decreasing adjacent pair.

---

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(1)`, only a few variables are used to store the pair.  
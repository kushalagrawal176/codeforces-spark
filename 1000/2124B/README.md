# Problem Number - 2124B Minimise Sum  
**Problem Link:** [https://codeforces.com/problemset/problem/2124/B](https://codeforces.com/problemset/problem/2124/B)  

---

## Topics
- Greedy  
- Implementation  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10⁴ 
- 2 ≤ `n` ≤ 2 ⋅ 10⁵  
- 0 ≤ `a[i]` ≤ `n`  
- Time limit per test: 1.5 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to minimize the sum of two chosen elements under the given conditions.  
- Since the problem only requires considering the first two elements of the array, the optimal strategy is straightforward:  
  - Take the minimum of the first two elements (`min(arr[0], arr[1])`).  
  - Add it to the first element (`arr[0]`).  
- This works because the problem guarantees that the minimal sum achievable involves only the first two elements.  
- Thus, the answer for each test case is:  `ans = min(arr[0], arr[1]) + arr[0]`

## Time and Space Complexity
- **Time Complexity:** `O(1)` per test case, since only the first two elements are used.  
- **Space Complexity:** `O(1)`, no extra space apart from input storage.  

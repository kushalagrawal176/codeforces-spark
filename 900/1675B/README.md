# Problem Number - 1675B Make It Increasing  
**Problem Link:** [https://codeforces.com/problemset/problem/1675/B](https://codeforces.com/problemset/problem/1675/B)  

---

## Topics
- Greedy  
- Implementation  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10⁴  
- 1 ≤ `n` ≤ 30  
- 0 ≤ `a[i]` ≤ 2 ⋅ 10⁹  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The task is to make the array strictly increasing by repeatedly dividing elements by 2.  
- Starting from the second last element and moving backwards:  
  - If `a[i] >= a[i+1]`, we must reduce `a[i]` by dividing it by 2 until it becomes strictly less than `a[i+1]`.  
  - Each division counts as one operation.  
  - If at any point both `a[i]` and `a[i+1]` become 0, it is impossible to make the array strictly increasing, so the answer is `-1`.  
- The total number of operations across all elements is the final answer.  

## Time and Space Complexity
- **Time Complexity:** `O(n log(max(a[i])))`, since each element may be halved multiple times.  
- **Space Complexity:** `O(n)`, for storing the array.  

# Problem Number - 327A Flipping Game  
**Problem Link:** [https://codeforces.com/problemset/problem/327/A](https://codeforces.com/problemset/problem/327/A)  

---

## Topics
- Greedy
- Dynamic Programming
- Implementation

## Constraints
- 1 ≤ `n` ≤ 100  
- Time limit per test: 1 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks to maximize the number of `1`s in a binary array after flipping **exactly one contiguous subarray** (turning `0 → 1` and `1 → 0`).
- Key observation:  
  - Flipping a `0` gives a **gain of +1** (since it becomes `1`).  
  - Flipping a `1` gives a **loss of -1** (since it becomes `0`).  
- Transform the array:  
  - Replace each `0` with `+1`.  
  - Replace each `1` with `-1`.  
- Now the task reduces to finding the **maximum subarray sum** in this transformed array (Kadane’s algorithm).  
- The final answer = `initial count of 1s + maximum gain`.  
- Edge case:  
  - If all elements are `1`, flipping any subarray reduces the count. The best possible result is `n - 1`.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for running Kadane’s algorithm over the array.  
- **Space Complexity:** `O(1)`, only constant extra space used.  

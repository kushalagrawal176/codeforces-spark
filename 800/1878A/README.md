# Problem Number - 1878A How Much Does Daytona Cost?  

**Problem Link:** [https://codeforces.com/problemset/problem/1878/A](https://codeforces.com/problemset/problem/1878/A)  

---

## Topics  
- Implementation  
- Arrays  
- Greedy  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 100 (length of array per test case)  
- 1 ≤ `k` ≤ 100 (target integer)  
- Array elements are integers within the given range  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether a given integer `k` exists in an array of size `n`.  
- For each test case:  
  1. Read integers `n` and `k`.  
  2. Read the array of size `n`.  
  3. Check if any element in the array equals `k`.  
  4. If found, print `"YES"`, otherwise print `"NO"`.  
- This is a direct search problem and can be solved with a simple linear scan of the array.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we may need to check all elements.  
- **Space Complexity:** `O(1)`, as only a flag or variable is needed to track whether `k` is found OR `O(n)` if using HashMap for `O(1)` retrieval

# Problem Number - 1869A Make It Zero  
**Problem Link:** [https://codeforces.com/problemset/problem/1869/A](https://codeforces.com/problemset/problem/1869/A)  

---

## Topics  
- Implementation  
- Simulation  
- Constructive Algorithms  

## Constraints  
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 2 ≤ `n` ≤ 100 (length of the array)  
- 0 ≤ `a[i]` ≤ 100 (array elements)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to make all elements of the array equal to zero using a sequence of operations.  
- Each operation allows us to select a segment `[l, r]` and apply a transformation to the chosen elements.  
- The key observation is that the actual values of the array do not matter — the solution only depends on the **parity of `n`** (whether `n` is even or odd).  

### Strategy:  
1. **If `n` is even:**  
   - We can zero out the entire array in **2 operations** by applying the operation on the whole array twice.  
   - Output:  
     ```
     2
     1 n
     1 n
     ```  

2. **If `n` is odd:**  
   - We need **4 operations**:  
     - Apply the operation twice on the first `n-1` elements.  
     - Apply the operation twice on the last two elements.  
   - Output:  
     ```
     4
     1 n-1
     1 n-1
     n-1 n
     n-1 n
     ```  

This guarantees that all elements become zero regardless of their initial values.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` for reading input, but the operations themselves are constant (2 or 4).  
- **Space Complexity:** `O(1)`, since we only store a few variables and print fixed operations.  

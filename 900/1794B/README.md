# Problem Number - 1794B Not Dividing  
**Problem Link:** [https://codeforces.com/problemset/problem/1794/B](https://codeforces.com/problemset/problem/1794/B)  

---

## Topics  
- Implementation  
- Arrays  
- Simulation  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 10⁴ (length of the array)  
- 1 ≤ `a[i]` ≤ 10⁹ (array elements)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The task is to modify the array so that **no element divides the next one**.  
- To achieve this, we can use a simple greedy strategy:  
  1. Increment each element by 1 initially.  
     - This ensures that even if the input contains equal numbers, they won’t trivially divide each other.  
  2. Traverse the array from left to right.  
  3. If `a[i+1] % a[i] == 0`, increment `a[i+1]` by 1.  
     - This breaks the divisibility condition.  
- Since we only need to ensure the condition holds for consecutive pairs, this greedy adjustment is sufficient.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, since we scan the array once.  
- **Space Complexity:** `O(n)`, for storing the array.  

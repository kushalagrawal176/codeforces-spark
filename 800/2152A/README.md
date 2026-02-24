# Problem Number - 2152A Increase or Smash

**Problem Link:** [https://codeforces.com/problemset/problem/2152/A](https://codeforces.com/problemset/problem/2152/A)

---

## Topics
- Implementation  
- Math  
- Frequency Counting  

## Constraints
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 100 (number of elements in each test case)  
- 1 ≤ `aᵢ` ≤ 100 (value of each element)  
- Time limit per test: 1 second  
- Memory limit per test: 1024 megabytes  

## Intuition / Approach 
- The problem starts with an array of zeros and asks us to transform it into a target array using two operations: 
    1. **Increase:** Add a positive integer `x` to all elements. 
    2. **Smash:** Set some elements to zero. 

- To reach the target array efficiently, the number of operations depends on the **number of distinct values** in the target array. 
- Each distinct value requires at most two operations: 
    - One "increase" to reach that value. 
    - One "smash" to reset unnecessary elements to zero. 
- However, the largest distinct value does not require a paired "smash" operation, since it can be achieved directly by increases. 
- Therefore, the formula for the minimum number of operations is: `2 * number of distinct elements - 1`

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan all elements and update frequency.  
- **Space Complexity:** `O(1)`, as the frequency array size is fixed.  

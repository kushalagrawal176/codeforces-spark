# Problem Number - 2014A Robin Helps  

**Problem Link:** [https://codeforces.com/problemset/problem/2014/A](https://codeforces.com/problemset/problem/2014/A)  

---

## Topics
- Implementation  
- Greedy  
- Arrays  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 50 (length of the array)  
- 1 ≤ `k` ≤ 100 (threshold value)  
- Array elements are integers between `0` and `100`  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to simulate Robin Hood’s actions in the town.  
- For each element in the array:  
  1. If the element is `0` and Robin currently has a positive balance (`sum > 0`), he spends one unit and increments the count of successful actions.  
  2. If the element is greater than or equal to `k`, Robin adds that value to his balance (`sum`).  
- At the end of the sequence, the count represents the number of times Robin successfully helped the town.  

- This greedy approach works because:  
  - Robin can only spend when he has balance (`sum > 0`).  
  - Only values greater than or equal to `k` contribute to his balance.  
  - The simulation directly follows the problem statement.  

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for iterating through all elements of the array.  
- **Space Complexity:** `O(1)`, only constant space is used for counters and sums.  

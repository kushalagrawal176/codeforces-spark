# Problem Number - 2126B No Casino in the Mountains  
**Problem Link:** [https://codeforces.com/problemset/problem/2126/B](https://codeforces.com/problemset/problem/2126/B)  
---

## Topics
- Implementation  
- Arrays  
- Simulation  
- Greedy  

## Constraints
- 1 ≤ `t` ≤ 10^4 (number of test cases)  
- 1 ≤ `n` ≤ 10^5 (number of elements in the array)  
- 1 ≤ `k` ≤ `n` (threshold for consecutive non-`1` values)  
- 0 ≤ a[i] ≤ 1 (array values)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to count how many times a "casino" can be built in the mountains, based on the sequence of values.  
- Rule:  
  - If the current element is `1`, reset the counter (`curr = 0`).  
  - Otherwise, increment the counter (`curr++`).  
  - When `curr == k`, it means we have found a valid segment. Increment the count (`cnt++`), skip the next element (`i++`), and reset `curr = 0`.  
- This greedy simulation ensures we maximize the number of casinos by immediately consuming valid segments when they appear.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we traverse the array once.  
- **Space Complexity:** `O(n)` for storing the array.  

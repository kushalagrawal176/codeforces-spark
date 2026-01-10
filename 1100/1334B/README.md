# Problem Number - 1334B Middle Class  
**Problem Link:** [https://codeforces.com/problemset/problem/1334/B](https://codeforces.com/problemset/problem/1334/B)  
---

## Topics
- Greedy  
- Sorting  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `x` ≤ 10⁹  
- 1 ≤ `a[i]` ≤ 10⁹ 
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks for the maximum number of people that can be considered "middle class," defined as having an average wealth of at least `x`.  
- To solve this, we sort the wealth array in descending order.  
- Starting from the richest person, we keep adding their wealth to a running sum.  
- At each step, we check if the average wealth of the selected group (`sum / count`) is at least `x`.  
- If yes, we increase the count; if not, we stop, since adding poorer individuals will only decrease the average further.  
- This greedy approach works because including wealthier individuals first maximizes the chance of maintaining the required average.  

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` per test case, due to sorting.  
- **Space Complexity:** `O(n)`, for storing the wealth values.  

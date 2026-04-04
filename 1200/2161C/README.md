# Problem Number - 2161C Loyalty  
**Problem Link:** [https://codeforces.com/problemset/problem/2161/C](https://codeforces.com/problemset/problem/2161/C)  

---

## Topics
- Greedy
- Sorting
- Two Pointers
- Implementation

## Constraints
- 1 ≤ `t` ≤ 2·10⁴  
- 1 ≤ `n` ≤ 10⁵  
- 1 ≤ `x` ≤ 10⁹  
- 1 ≤ `aᵢ` ≤ `x`  
- Time limit per test: 2 seconds  
- Memory limit: 512 megabytes  

## Intuition / Approach
- The problem requires constructing a sequence of elements from the given array such that the **loyalty level increases by adding elements from the sequence**.  
- We have to choose the elements in such an order such that loyalty level increases and total bonus points is maximum
- We first sort the array elements in increasing order
- We add elements from the `start` position till the `sum` < `x`
- Then, add the element from the `end` position, to increase the loyalty level
- Repeat until the `start` <= `end`

## Time and Space Complexity
- **Time Complexity:** `O(n log n)` due to sorting
- **Space Complexity:** `O(n)` for storing the sequence.  
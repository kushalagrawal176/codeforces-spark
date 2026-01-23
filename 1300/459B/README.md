# Problem Number - 459B Pashmak and Flowers  
**Problem Link:** [https://codeforces.com/problemset/problem/459/B](https://codeforces.com/problemset/problem/459/B)  

---

## Topics
- Implementation  
- Math  
- Combinatorics  

## Constraints
- 2 ≤ `n` ≤ 2 × 10^5  
- 1 ≤ `a[i]` ≤ 10^9  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to find two values:
  1. The maximum beauty difference between any two flowers.  
  2. The number of ways to choose such pairs.  

- **Step 1:** Find the minimum and maximum beauty values among all flowers.  
- **Step 2:** The maximum difference is simply `max - min`.  
- **Step 3:** Count how many flowers have beauty equal to `max` and how many have beauty equal to `min`.  
- **Step 4:**  
  - If all flowers have the same beauty (`max == min`), then every pair has difference `0`.  
    - The number of ways is `n × (n - 1) / 2` (choose any two flowers).  
  - Otherwise, the number of ways is `count(max) × count(min)` (choose one flower with max beauty and one with min beauty).  

This approach ensures we only need a single pass to compute min, max, and counts.

## Time and Space Complexity
- **Time Complexity:** `O(n)`, for scanning the array and counting occurrences.  
- **Space Complexity:** `O(1)`, only constant extra space used.  

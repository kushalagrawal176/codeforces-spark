# Problem Number - 519B A and B and Compilation Errors  
**Problem Link:** [https://codeforces.com/problemset/problem/519/B](https://codeforces.com/problemset/problem/519/B)  
---
## Topics
- Implementation  
- Math  
- Prefix/Suffix sums  

## Constraints
- 3 ≤ n ≤ 10^5
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem describes a scenario where we have three sequences of integers:  
  1. The original sequence of `n` numbers.  
  2. A sequence of `n-1` numbers (original sequence with one number missing).  
  3. A sequence of `n-2` numbers (second sequence with one more number missing).  

- The task is to find the two missing numbers.  

### Key Insight:
- Instead of tracking individual elements, we can use **sum differences**:  
  - Let `sumA` = sum of the first sequence.  
  - Let `sumB` = sum of the second sequence.  
  - Let `sumC` = sum of the third sequence.  
- Then:  
  - The first missing number = `sumA - sumB`.  
  - The second missing number = `sumB - sumC`.  

This works because each sequence is formed by removing exactly one element, so the difference in sums directly gives the missing element.

## Time and Space Complexity
- **Time Complexity:** O(n), for reading input and computing sums.  
- **Space Complexity:** O(1), only constant space used for sum variables.  

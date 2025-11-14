# Problem Number - 1360C Similar Pairs

**Problem Link:** [https://codeforces.com/problemset/problem/1360/C](https://codeforces.com/problemset/problem/1360/C)

---

## Topics
- Implementation  
- Greedy  
- Math  
- Sorting

## Constraints
- 1 ≤ t ≤ 1000 (number of test cases)  
- 2 ≤ n ≤ 50 (size of array)  
- 1 ≤ ai ≤ 100 (array elements)  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- Two numbers are considered *similar* if they have the same parity (both odd or both even), or if their absolute difference is exactly 1.  
- To solve the problem, we need to check if the array can be partitioned into pairs of similar numbers.  
- Steps:
  1. Count the number of odd and even elements.  
  2. If both counts are even, pairing is always possible (odds with odds, evens with evens). → **YES**  
  3. If one count is odd and the other is odd too, then there will be a mismatch. To fix this, check if there exists at least one pair of elements with difference = 1. If such a pair exists, → **YES**.  
  4. Otherwise, → **NO**.  

This works because the only obstacle is mismatched parity counts, and consecutive numbers (difference = 1) allow cross-parity pairing to resolve the mismatch.

## Time and Space Complexity
- **Time Complexity:** O(n), for scanning the array and checking consecutive pairs.  
- **Space Complexity:** O(1) or O(n) depending on implementation (frequency array or sorting).  
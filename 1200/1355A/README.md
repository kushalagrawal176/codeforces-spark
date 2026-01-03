# Problem Number - 1355A Sequence with Digits  
**Problem Link:** [https://codeforces.com/problemset/problem/1355/A](https://codeforces.com/problemset/problem/1355/A)  

---

## Topics  
- Implementation  
- Simulation  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 1000  
- 1 ≤ `a` ≤ 10¹⁸  
- 1 ≤ `k` ≤ 10¹⁶  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem defines a sequence starting with integer `a`.  
- Each next element is obtained by adding the product of the minimum and maximum digits of the current number.  
- We need to compute the value of the sequence after `k` steps.  
- Key observations:  
  - If at any step the minimum digit becomes `0`, the sequence stops changing (since `min × max = 0`).  
  - Otherwise, we continue updating until either `k` steps are exhausted or the sequence stabilizes.  
- Approach:  
  - For each test case, simulate the process step by step.  
  - Extract digits of the current number to find `min` and `max`.  
  - Update the number as `a = a + (min × max)`.  
  - Stop early if `min = 0`.  
- This direct simulation works because the sequence stabilizes quickly, and the constraints allow efficient digit extraction.  

## Time and Space Complexity  
- **Time Complexity:** `O(k × log(a))`, since each step requires digit extraction. In practice, the loop terminates early when `min = 0`.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  

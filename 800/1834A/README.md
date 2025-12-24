# Problem Number - 1834A Unit Array  
**Problem Link:** [https://codeforces.com/problemset/problem/1834/A](https://codeforces.com/problemset/problem/1834/A)  

---

## Topics  
- Implementation  
- Greedy  
- Arrays  
- Math  

## Constraints  
- 1 ≤ `t` ≤ 500  
- 1 ≤ `n` ≤ 100  
- Array elements are either `-1` or `1` 
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to transform the given array into a **unit array**, where the sum of all elements is strictly positive and product of elements is `1`.  
- Allowed operation: change any element from -1 to 1.  
- Steps:  
  1. Compute the sum of the array and count the number of negative elements.  
  2. If the sum is negative, we must flip enough -1s to 1s to make the sum positive.  
     - Minimum flips required = `(-sum + 1) / 2`.  
  3. After ensuring positivity, check parity:  
     - If the number of flips and the number of negatives have different parity, one extra flip is needed to make the count of negatives even.  
  4. The total number of flips is the answer.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`per test case, for scanning the array.  
- **Space Complexity:** `O(1)`, only counters and sum are stored.  

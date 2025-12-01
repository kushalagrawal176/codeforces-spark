# Problem Number - 1742B Increasing

**Problem Link:** [https://codeforces.com/problemset/problem/1742/B](https://codeforces.com/problemset/problem/1742/B)

---

## Topics
- Implementation  
- Sets / Hashing  
- Math  

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 100 (length of the sequence)  
- 1 ≤ `a[i]` ≤ 10^9 (elements of the sequence)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether the given sequence can be rearranged into a **strictly increasing sequence**.  
- A strictly increasing sequence requires all elements to be **distinct**.  
- Therefore, the task reduces to checking if the array contains any duplicates.  
- Approach:  
  1. Read the sequence.  
  2. Use a set (or hash map) to track elements.  
  3. If a duplicate is found → print `"NO"`.  
  4. If all elements are unique → print `"YES"`.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we scan the array once and check for duplicates.  
- **Space Complexity:** `O(n)`, for storing elements in a set/HashMap.  

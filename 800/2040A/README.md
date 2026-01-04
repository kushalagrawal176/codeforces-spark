# Problem Number - 2040A Game of Division  

**Problem Link:** [https://codeforces.com/problemset/problem/2040/A](https://codeforces.com/problemset/problem/2040/A)  

---

## Topics
- Brute Force  
- Implementation  
- Number Theory  
- Games

## Constraints
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `n` ≤ 100 (number of elements in the array)  
- 1 ≤ `k` ≤ 100 
- 1 ≤ `a[i]` ≤ 100  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

## Intuition / Approach
- We are given an array of integers and a divisor `k`.  
- The task is to determine if there exists an element `arr[i]` such that for **every other element** `arr[j]`, the difference `|arr[i] - arr[j]|` is **not divisible by k**.  
- If such an element exists, print `"YES"` and its 1-based index. Otherwise, print `"NO"`.  

### Steps:
1. Read input values.  
2. For each element `arr[i]`, check against all other elements `arr[j]`.  
3. If `|arr[i] - arr[j]| % k == 0` for any `j ≠ i`, then `arr[i]` is invalid.  
4. If we find an element that passes the check for all others, output `"YES"` and its index.  
5. If no such element exists, output `"NO"`.  

This brute force approach works because `n` is small (≤ 100), so checking all pairs is feasible within the time limit.  

## Time and Space Complexity
- **Time Complexity:** `O(n²)` per test case, since we compare each element with all others.  
- **Space Complexity:** `O(n)` for storing the array.  
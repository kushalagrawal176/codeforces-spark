# Problem Number - 1789A Serval and Mocha's Array  

**Problem Link:** [https://codeforces.com/problemset/problem/1789/A](https://codeforces.com/problemset/problem/1789/A)  

---

## Topics  
- Number Theory  
- Implementation  
- Brute Force  

## Constraints  
- 1 ≤ `t` ≤ 500 (number of test cases)  
- 2 ≤ `n` ≤ 100 (array size)  
- 1 ≤ `a[i]` ≤ 10^6 (array elements)  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks whether there exists a pair of elements in the array such that their **GCD ≤ 2**.  
- Key observations:  
  - If any two numbers share a small GCD (1 or 2), then Serval and Mocha can cooperate successfully.  
  - We need to check all pairs `(i, j)` in the array.  
- Approach:  
  1. Read the array of size `n`.  
  2. For each pair `(i, j)` where `i < j`, compute `gcd(arr[i], arr[j])`.  
  3. If any pair has `gcd ≤ 2`, print `"YES"`.  
  4. Otherwise, print `"NO"`.  

## Time and Space Complexity  
- **Time Complexity:** `O(n²)` per test case, since we check all pairs.  
- **Space Complexity:** `O(1)`, only constant space is used aside from the input array.  

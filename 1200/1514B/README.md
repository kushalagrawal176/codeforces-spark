# Problem Number - 1514B AND 0, Sum Big  
**Problem Link:** [https://codeforces.com/problemset/problem/1514/B](https://codeforces.com/problemset/problem/1514/B)  

---

## Topics
- Combinatorics  
- Modular Arithmetic  
- Binary Exponentiation  

## Constraints
- 1 ≤ `t` ≤ 10  
- 1 ≤ `n` ≤ 10^5  
- 1 ≤ `k` ≤ 20  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- We need to count the number of arrays of length `n` such that:  
  - Each element is between `0` and `2^k - 1`.  
  - The bitwise AND of all elements is `0`.  
  - The sum of elements is as large as possible.  

- To maximize the sum while ensuring the bitwise AND is `0`, each bit position (from 0 to k-1) must contain at least one `0` across the array.  
- This means for each of the `k` bit positions, we can freely choose which element will carry the `0`.  
- Since there are `n` choices for each bit position, the total number of valid arrays is:  

    **n^k**

- Because the result can be very large, we compute it modulo **1,000,000,007**.  
- The efficient way to compute `n^k mod 1,000,000,007` is using **binary exponentiation (fast power)**, which reduces the complexity from `O(k)` to `O(log k)`.  

## Time and Space Complexity
- **Time Complexity:**  `O(k)` OR `O(log k)` if using fast modular exponentiation.  
- **Space Complexity:**  `O(1)`, only constant space is used.  

# Problem Number - 1343A Candies  
**Problem Link:** [https://codeforces.com/problemset/problem/1343/A](https://codeforces.com/problemset/problem/1343/A)  

---

## Topics
- Implementation  
- Math  
- Brute Force  

## Constraints
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 3 ≤ `n` ≤ 10⁹  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks to find the number of candies each child receives when `n` candies are distributed among `k` children such that the distribution follows the form:  `n = x * (2^1 + 2^2 + ... + 2^(k-1))` 

    ![formula](https://latex.codecogs.com/png.latex?\bg_white%20\color{Black}%20n%20%3D%20x%20%5Ccdot%20%282%5E1%20%2B%202%5E2%20%2B%20%5Cdots%20%2B%202%5E%7Bk-1%7D%29)
- The sum of powers of 2 up to `k-1` is `2^k - 1`.  
- Therefore, we need to find the smallest `k` such that `n % (2^k - 1) == 0`.  
- Once found, the answer is simply `n / (2^k - 1)`.  
- Steps:  
  1. Start with `sum = 3` (which is `2^2 - 1`).  
  2. Incrementally add powers of 2 until `n % sum == 0`.  
  3. Output `n / sum`.  

## Time and Space Complexity
- **Time Complexity:** `O(log n)`, since we keep adding powers of 2 until the divisor divides `n`.  
- **Space Complexity:** `O(1)`, only constant space used for variables.  

# Problem Number - 80A Panoramix's Prediction  

**Problem Link:** [https://codeforces.com/problemset/problem/80/A](https://codeforces.com/problemset/problem/80/A)  

---

## Topics
- Primality Testing  
- Implementation  
- Math  

## Constraints
- 2 ≤ `n` < `m` ≤ 50  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks whether `m` is the **next prime number** immediately after `n`.  
- To solve this, we need to:  
  1. Check if `m` is prime.  
  2. Find the next prime after `n`.  
  3. Compare whether `m` equals that next prime.  
- If `m` is exactly the next prime after `n`, print `"YES"`. Otherwise, print `"NO"`.  

### Steps:
1. Implement a helper function `isPrime(x)` to check if a number is prime.  
2. Implement `nextPrime(n)` to find the next prime greater than `n`.  
3. Compare `m` with `nextPrime(n)`.  
4. OR
5. Since, constraints are small we can hardcode prime values directly 

## Time and Space Complexity
- **Time Complexity:**  
  - `isPrime(x)` runs in `O(sqrt(x))`.  
  - `nextPrime(n)` may check a few numbers until the next prime is found.  
  - Overall complexity is efficient given the small constraint (n, m ≤ 50).  

- **Space Complexity:**  
  - `O(1)`, only constant space used for variables.  

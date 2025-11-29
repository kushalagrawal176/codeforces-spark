# Problem Number - 1541B Pleasant Pairs  
**Problem Link:** [https://codeforces.com/problemset/problem/1541/B](https://codeforces.com/problemset/problem/1541/B)  

---

## Topics  
- Implementation  
- Math  
- Number Theory  

---

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 2 ≤ `n` ≤ 10⁵ (size of array)  
- 1 ≤ `aᵢ` ≤ 2n (array elements)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- We need to count pairs `(i, j)` such that:  

    a[i] * a[j] = i + j ,  i < j

- **Naive approach:**  
  - Check all pairs `(i, j)` → O(n²), which is too slow for n up to 10⁵.  

- **Optimized approach:**  
  - Since `a[i] ≤ 2n`, the product `a[i] * a[j]` must be ≤ 2n.  
  - For each index `i`, iterate possible values of `j` using:  
    
    j = a[i] * k - i
  
    where `k` is an integer multiplier.  
  - Ensure `j > i` and `j ≤ n`.  
  - Check if `a[j] = k`.  
  - This reduces the search space significantly.  

- **Key observation:**  
  - Instead of brute force, only check multiples of `a[i]` up to `2n`.  
  - This makes the algorithm efficient enough for large inputs.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n √n)` approximately, since we only check limited multiples for each element.  
- **Space Complexity:** `O(n)`, for storing the array elements.  

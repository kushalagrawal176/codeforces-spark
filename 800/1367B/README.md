# Problem Number - 1367B Even Array  
**Problem Link:** [https://codeforces.com/problemset/problem/1367/B](https://codeforces.com/problemset/problem/1367/B)  

---

## Topics  
- Implementation  
- Arrays  
- Parity  

---

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `n` ≤ 40 (size of array)  
- 0 ≤ `aᵢ` ≤ 1000 (array elements)  
- Time limit per test: 2 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The task is to rearrange the array so that:  
  - Elements at even indices are even numbers.  
  - Elements at odd indices are odd numbers.  

- **Key Observations:**  
  - If an element at index `i` has the same parity as `i`, it is already correct.  
  - If not, it contributes to a mismatch.  
  - Count mismatches separately:  
    - `odd` → number of odd elements placed at even indices.  
    - `even` → number of even elements placed at odd indices.  
  - To fix the array, each swap can correct one `odd` and one `even` mismatch.  
  - Therefore, the minimum number of swaps required is `even` (or `odd`) if they are equal.  
  - If they are not equal, it is impossible to fix the array → output `-1`.  

- **Example:**  
  - Input: `n = 4`, array = `[3, 2, 7, 6]`  
  - Index 0 → 3 (odd, mismatch)  
  - Index 1 → 2 (even, mismatch)  
  - Index 2 → 7 (odd, correct)  
  - Index 3 → 6 (even, correct)  
  - Mismatches: odd = 1, even = 1 → answer = 1 swap.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for checking each element once.  
- **Space Complexity:** `O(1)`, only counters are used.  

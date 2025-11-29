# Problem Number - 1903A Halloumi Boxes  
**Problem Link:** [https://codeforces.com/problemset/problem/1903/A](https://codeforces.com/problemset/problem/1903/A)  

---

## Topics  
- Implementation  
- Arrays  
- Sorting  
- Greedy  

---

## Constraints  
- 1 ≤ `t` ≤ 100 (number of test cases)  
- 1 ≤ `k` ≤ `n` ≤ 100    
- 1 ≤ `aᵢ` ≤ 10^9 (array elements)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The problem asks whether it is possible to sort the array in non-decreasing order using a special operation.  
- Operation: In one move, you can select any subarray of length `k` and rearrange its elements in any order.  

- **Key Observations:**  
  - If `k > 1`, you can always sort the entire array because multiple rearrangements allow full control over the array.  
  - If `k = 1`, you cannot change the array at all. In this case, the array must already be sorted to answer `"YES"`.  
  - Therefore:  
    - If the array is already sorted → `"YES"`.  
    - If `k > 1` → `"YES"`.  
    - Otherwise → `"NO"`.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)` per test case, for checking if the array is sorted.  
- **Space Complexity:** `O(1)`, only constant space used for counters and flags.  

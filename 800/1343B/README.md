# Problem Number - 1343B Balanced Array  
**Problem Link:** [https://codeforces.com/problemset/problem/1343/B](https://codeforces.com/problemset/problem/1343/B)  

---

## Topics  
- Implementation  
- Math  
- Constructive Algorithms  

---

## Constraints  
- 1 ≤ `t` ≤ 10000 (number of test cases)  
- 2 ≤ `n` ≤ 2 × 10⁵ (size of array, always even)  
- Time limit per test: 1 second  
- Memory limit: 256 megabytes  

---

## Intuition / Approach  
- The task is to construct an array of size `n` such that:  
  - The first half consists of even numbers.  
  - The second half consists of odd numbers.  
  - The sum of the first half equals the sum of the second half.  

- **Key Observation:**  
  - A balanced array is only possible if `n/2` is even.  
  - If `n/2` is odd, the sums of even and odd halves cannot be equal → print `"NO"`.  
  - Otherwise:  
    - Place the first `n/2` even numbers in the first half.  
    - Place the first `n/2 - 1` odd numbers in the second half.  
    - Adjust the last odd number so that the total sum of both halves matches.  

- **Example:**  
  - For `n = 8`:  
    - First half: `2 4 6 8` (sum = 20)  
    - Second half: `1 3 5 11` (sum = 20)  
    - Balanced array achieved.  

---

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, for constructing the array elements.  
- **Space Complexity:** `O(n)`, for storing the constructed array before printing.  

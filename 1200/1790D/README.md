# Problem Number - 1790D Matryoshkas  
**Problem Link:** [https://codeforces.com/problemset/problem/1790/D](https://codeforces.com/problemset/problem/1790/D)  

---

## Topics  
- Greedy  
- Implementation  
- Maps / Frequency Counting  

## Constraints  
- 1 ≤ `t` ≤ 10⁴ (number of test cases)  
- 1 ≤ `n` ≤ 2·10⁵ (number of dolls per test case)  
- 1 ≤ `aᵢ` ≤ 10⁹ (size of each doll)  
- Sum of `n` over all test cases ≤ 2·10⁵  
- Time limit per test: 2 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- We are given `n` dolls with sizes, and we want to form the minimum number of **Matryoshka sets** (nested sequences of consecutive sizes).  
- Key observation:  
  - If we have `x` dolls of size `k`, and `y` dolls of size `k-1`, then at most `y` of the `x` dolls can be nested inside the `k-1` dolls.  
  - The remaining `x - y` dolls of size `k` must start new Matryoshka sets.  
- Therefore, for each distinct size `k`, the number of new sets we need to start is:  
    
    **$\max(0, \text{freq}[k] - \text{freq}[k-1])$**
  
- Summing this over all distinct sizes gives the minimum number of Matryoshka sets.  

### Steps  
1. Count the frequency of each doll size using a map.  
2. For each size `k`, compute how many new sets must start using the formula above.  
3. Add up all these values to get the answer.  

## Time and Space Complexity  
- **Time Complexity:**  
  - `O(n)` per test case for counting frequencies and iterating over keys.   
- **Space Complexity:**  
  - `O(n)` for storing frequencies in a map.  

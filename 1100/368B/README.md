# Problem Number - 368B Sereja and Suffixes  
**Problem Link:** [https://codeforces.com/problemset/problem/368/B](https://codeforces.com/problemset/problem/368/B)  
---
## Topics
- Data Structures  
- Implementation  
- Prefix/Suffix Processing  
- Prefix/Suffix Sum
- Hashing / Sets  

## Constraints
- 1 ≤ n, m ≤ 10^5  
- 1 ≤ a[i] ≤ 10^5  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem asks us to answer multiple queries about the number of distinct integers in suffixes of an array.  
- A naive approach would be to recompute distinct elements for each query, but that would be too slow `O(n·m)`.  
- Instead, we preprocess the array from right to left:  
  - Maintain a set (or hash map) of seen elements.  
  - At each index `i`, store the number of distinct elements from `i` to `n`.  
- This preprocessing ensures that each query can be answered in `O(1)` time.  

### Steps:
1. Traverse the array from the end to the beginning.  
2. Keep track of distinct elements using a set or boolean array.  
3. Store the count of distinct elements at each index in a `freq[]` array.  
4. For each query `l`, simply output `freq[l]`.  

## Time and Space Complexity
- **Time Complexity:**  
  - Preprocessing: `O(n)`, since each element is inserted into the set at most once.  
  - Query answering: `O(1)` per query.  
  - Total: `O(n + m)`.  
- **Space Complexity:**  
  - `O(n)` for the frequency array.  
  - `O(k)` for the set/hash map, where `k` is the number of distinct elements.  

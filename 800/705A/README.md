# Problem Number - 705A Hulk  
**Problem Link:** [https://codeforces.com/problemset/problem/705/A](https://codeforces.com/problemset/problem/705/A)  

---

## Topics  
- Strings  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 100  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The problem asks us to construct a sentence that represents Hulk's feelings depending on the number `n`.  
- The sentence alternates between `"I hate"` and `"I love"` for each position from 1 to `n`.  
  - Odd positions → `"I hate"`  
  - Even positions → `"I love"`  
- Between each phrase (except the last one), we insert `"that"`.  
- At the end of the sequence, we append `"it"`.  
- Example:  
  - For `n = 1`: `"I hate it"`  
  - For `n = 2`: `"I hate that I love it"`  
  - For `n = 3`: `"I hate that I love that I hate it"`  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, since we build the sentence by iterating through numbers from 1 to `n`.  
- **Space Complexity:** `O(n)`, for storing the constructed string.  

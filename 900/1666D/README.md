# Problem Number - 1666D Deletive Editing  
**Problem Link:** [https://codeforces.com/problemset/problem/1666/D](https://codeforces.com/problemset/problem/1666/D)  

---

## Topics  
- Strings  
- Greedy  
- Implementation  

## Constraints  
- 1 ≤ `n` ≤ 10⁴ (number of test cases)  
- 1 ≤ `|s|`, `|t|` ≤ 30 (length of strings)  
- Strings consist of uppercase English letters (A–Z)  
- Time limit per test: 3 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach  
- The problem asks whether string `t` can be obtained from string `s` by **deletive editing**.  
- Deletive editing means we can delete characters from `s` but must preserve the order of characters in `t`.  
- Approach:  
  1. Count the frequency of each character in `t`.  
  2. Traverse `s` from the end to the beginning.  
  3. Whenever a character from `s` is still needed (frequency > 0), add it to the result and decrement its frequency.  
  4. Reverse the constructed string.  
  5. If the reversed string equals `t`, then `t` can be formed → print "YES". Otherwise → print "NO".  

## Time and Space Complexity  
- **Time Complexity:** `O(|s| + |t|)`, for traversing and frequency counting.  
- **Space Complexity:** `O(26) = O(1)`, constant space for frequency array.  

# Problem Number - 1480A Yet Another String Game  
**Problem Link:** [https://codeforces.com/problemset/problem/1480/A](https://codeforces.com/problemset/problem/1480/A)  

---

## Topics  
- Implementation  
- Strings  
- Greedy
- Games  

## Constraints  
- 1 ≤ `t` ≤ 1000 (number of test cases)  
- 1 ≤ `|s|` ≤ 50 (length of string per test case)  
- Characters are lowercase English letters  
- Time limit per test: 2 second  
- Memory limit per test: 512 megabytes  

## Intuition / Approach  
- The game is played alternately by Alice and Bob on the string `s`.  
- Alice moves first (turn 1), Bob moves second (turn 2), and they alternate.  
- Rules:  
  - On Alice’s turn:  
    - If the character is `'a'`, change it to `'b'`.  
    - Otherwise, change it to `'a'`.  
  - On Bob’s turn:  
    - If the character is `'z'`, change it to `'y'`.  
    - Otherwise, change it to `'z'`.  
- After processing all characters, the modified string is printed.  

### Steps  
1. Read the number of test cases `t`.  
2. For each test case, read the string `s`.  
3. Initialize `turn = 1` (Alice starts).  
4. Traverse the string:  
   - If `turn == 1` (Alice):  
     - Replace `'a'` with `'b'`, else replace with `'a'`.  
   - If `turn == 2` (Bob):  
     - Replace `'z'` with `'y'`, else replace with `'z'`.  
   - Toggle turn after each character.  
5. Print the final string.  

## Time and Space Complexity  
- **Time Complexity:** `O(|s|)` per test case, since each character is processed once.  
- **Space Complexity:** `O(|s|)`, for storing the modified string.  

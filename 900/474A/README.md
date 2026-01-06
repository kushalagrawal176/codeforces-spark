# Problem Number - 474A Keyboard  
**Problem Link:** [https://codeforces.com/problemset/problem/474/A](https://codeforces.com/problemset/problem/474/A)  

---

## Topics
- Implementation  
- Strings  
- Simulation  

## Constraints
- Input consists of:  
  - A single character `ch` (`L` or `R`) indicating the shift direction.  
  - A string `s` consisting of characters from the keyboard layout.  
- `String length` ≤ 100  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach
- The problem simulates typing on a shifted keyboard.  
- The keyboard layout is fixed: `"qwertyuiopasdfghjkl;zxcvbnm,./"`.  
- If the shift direction is `'R'`, each character in the input string should be replaced by the character immediately to its **left** in the layout.  
- If the shift direction is `'L'`, each character should be replaced by the character immediately to its **right**.  
- Steps:  
  1. Store the keyboard layout as a string.  
  2. For each character in the input string, find its index in the layout.  
  3. Replace it with the character at `index - 1` (if `R`) or `index + 1` (if `L`).  
  4. Build and print the transformed string.  

## Time and Space Complexity
- **Time Complexity:** `O(n × m)`, where `n` is the length of the input string and `m` is the keyboard layout length (constant 30). Effectively `O(n)`.  
- **Space Complexity:** `O(1)`, only constant extra space used for the layout and result string.  

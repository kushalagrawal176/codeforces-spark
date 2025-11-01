# Problem Number - 268B Buttons  
**Problem Link:** [https://codeforces.com/problemset/problem/268/B](https://codeforces.com/problemset/problem/268/B)

---

## Topics

- Combinatorics  
- Implementation  
- Math

## Constraints

- 1 ≤ n ≤ 2000  
- Time limit per test: 1 second  
- Memory limit per test: 256 megabytes

## Intuition / Approach

- The problem asks for the total number of button presses Manao will make while trying all possible sequences to open the lock.
- For each button `i` from 1 to `n`, Manao will try pressing it in all possible positions in the sequence.
- The number of presses for button `i` is `i × (n - i + 1)`, which accounts for all positions it can appear in.
- Summing this over all `i` from 1 to `n` gives the total number of presses.
- This can be expressed as:  
    Total presses = sum from i = 1 to n of i * (n - i + 1)

## Time and Space Complexity

- **Time Complexity:**  O(n), for iterating through all buttons. or O(1) by using combinatorics
- **Space Complexity:** O(1), only constant space used for accumulation.
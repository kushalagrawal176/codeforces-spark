# Problem Number - 2104C Card Game  

**Problem Link:** [https://codeforces.com/problemset/problem/2104/C](https://codeforces.com/problemset/problem/2104/C)  

---

## Topics
- Game Theory  
- Greedy  
- Implementation  

## Constraints
- 1 ≤ `t` ≤ 5000  
- 2 ≤ `n` ≤ 50  
- At least one card is initially given to Alice and one to Bob  
- Time limit per test: 2 seconds  
- Memory limit per test: 512 megabytes  

## Intuition / Approach
- Alice and Bob are playing with cards numbered from 1 to `n`.  
- **Rule:** Card `i` beats card `j` if `i > j`, except card `1` beats card `n`.  
- Each round: Alice plays first, Bob responds optimally. The winner of the round takes both cards.  
- A player can reuse cards they win in later rounds. The game ends when one player has no cards left.  

### Key Observations:
- The **first and last card ownership** is crucial:
  - If both **first and last cards belong to the same player**, that player wins.  
  - Otherwise, the game depends on the distribution of `A` and `B` cards.  
- Bob has the advantage of responding after seeing Alice’s move, so Alice must rely on specific configurations to force a win.  
- The problem reduces to analyzing **edge cases**:
  - If Alice has both card `1` and card `n`, she can force a win.  
  - If Bob has both, he wins.  
  - If Bob has only one `B` card and it’s the last card, Alice can still win.  
  - Otherwise, Bob wins due to his reactive advantage.  

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we may need to count cards or check positions.  
- **Space Complexity:** `O(1)`, only constant space used for counters and checks.  

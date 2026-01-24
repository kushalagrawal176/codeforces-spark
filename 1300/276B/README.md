# Problem Number - 276B Little Girl and Game  

**Problem Link:** [https://codeforces.com/problemset/problem/276/B](https://codeforces.com/problemset/problem/276/B)  

---

## Topics  
- Strings  
- Game Theory  
- Implementation  

## Constraints  
- Input string length: 1 ≤ `|s|` ≤ 1000  
- Time limit per test: 2 seconds  
- Memory limit per test: 256 megabytes  

## Intuition / Approach  
- The game is played on a string where players can remove characters. The winner is determined by whether the string can be rearranged into a palindrome.  
- A palindrome requires that at most one character has an odd frequency.  
- Steps to solve:  
  1. Count the frequency of each character in the string.  
  2. Determine how many characters have odd frequencies.  
  3. If there are no odd frequencies, or if the number of odd frequencies minus one is even, then the **First** player wins. Otherwise, the **Second** player wins.  
- This works because the first player can always force a win if the number of odd characters (after adjustment) is even.  

## Time and Space Complexity  
- **Time Complexity:** `O(n)`, where n is the length of the string (for counting frequencies).  
- **Space Complexity:** `O(1)`, since we only need a fixed-size frequency array or map (maximum 26 letters for lowercase English alphabet).  

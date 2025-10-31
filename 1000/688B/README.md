# Problem Number - 688B Lovely Palindromes  
**Problem Link:** [https://codeforces.com/problemset/problem/688/B](https://codeforces.com/problemset/problem/688/B)

---

## Topics

- Strings  
- Implementation

## Constraints

- The input number \( n \) contains between 1 ≤ n ≤ 10^100000.
- The number does not have leading zeros.

## Intuition / Approach

- A lovely palindrome is formed by concatenating a number \( n \) and its reverse.
- Read the input string \( n \).
- Reverse the string \( n \).
- Concatenate the original and reversed strings.
- Print the resulting palindrome.

## Examples

- Consider, 
- n = 1, O/P => 11
- n = 10, O/P => 1001
- n = 17, O/P => 1771
- Even-length palindrome => 11, 22, 33, 44, 55, 66, 77, 88, 99, 1001, 1111, 1221, 1331, 1441, 1551, 1661....

---

## Time and Space Complexity

- **Time Complexity:**  O(L), where L is the length of the input string.
- **Space Complexity:** O(L), for storing the reversed string.

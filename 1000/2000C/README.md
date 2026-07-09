# Problem Number - 2000C Numeric String Template

**Problem Link:** [https://codeforces.com/problemset/problem/2000/C](https://codeforces.com/problemset/problem/2000/C)

---

## Topics
- Hashing
- Strings
- Implementation

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $1 \le n \le 2 \cdot 10^5$ (Length of the array)
- $-10^9 \le a_i \le 10^9$ (Array elements)
- $1 \le m \le 2 \cdot 10^5$ (Number of strings to test)
- $1 \le |s_i| \le 2 \cdot 10^5$ (Length of each string)
- The sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.
- The sum of the lengths of all strings over all test cases does not exceed $2 \cdot 10^5$.
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
The problem requires us to determine if a given string $s$ matches the template defined by an array $a$ of length $n$. For a string to match the numeric template, it must satisfy two main conditions:
1. **Length Match:** The length of the string $|s|$ must be exactly equal to $n$. If it's not, it's impossible to form a valid template mapping.
2. **Bijective (One-to-One) Mapping:** - Every unique integer in the array $a$ must map to exactly one unique character in the string $s$.
   - Conversely, every unique character in $s$ must map to exactly one unique integer in $a$.

To efficiently check this, we can maintain two hash maps (or hash tables) as we iterate through the array and the string simultaneously from index $0$ to $n-1$:
- `num_to_char`: Maps an integer $a[i]$ to a character $s[i]$.
- `char_to_num`: Maps a character $s[i]$ to an integer $a[i]$.

If at any point a number is already mapped to a different character, or a character is already mapped to a different number, the string is invalid (`NO`). If we successfully check the entire string without a conflict, it is valid (`YES`).

## Time and Space Complexity
- **Time Complexity:** - Using standard hash maps (`unordered_map` in C++ or `HashMap` in Java), each insertion and lookup takes $O(1)$ on average. Thus, verifying a single string takes $O(n)$ time.
  - Across all queries and test cases, the total time complexity is $O(n + \sum |s|)$, which easily passes within the 2-second time limit.
- **Space Complexity:** - $O(n)$ auxiliary space per string query to store the bidirectional mappings. In the worst case, the map size is bounded by $\min(n, 26)$ since there are only 26 lowercase English letters.
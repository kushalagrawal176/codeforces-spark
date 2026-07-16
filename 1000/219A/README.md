# Problem 219A - k-String

**Problem Link:** [https://codeforces.com/problemset/problem/219/A](https://codeforces.com/problemset/problem/219/A)

---

## Topics
- Implementation
- Strings

## Constraints
- 1 ≤ `k` ≤ 1000
- 1 ≤ `|s|` ≤ 1000 (where |s| is the length of string s)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A string can be rearranged into a $k$-string if and only if it consists of $k$ identical substrings concatenated together.
- For this to be possible, every unique character in the original string must have a frequency that is perfectly divisible by $k$.
- We count the frequency of each character in the string. If any character's frequency modulo $k$ is not zero, it's impossible to distribute that character evenly across $k$ parts, so we output `-1`.
- If all frequencies are divisible by $k$, we construct a single "base pattern" by taking each character `count / k` times. 
- The final result is obtained by printing or concatenating this base pattern exactly $k$ times.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(|s|)$, where $|s|$ is the length of the string. We iterate through the string once to count frequencies, then a constant 26 steps to check viability and build the base string, and finally $k$ iterations to construct the output.
- **Space Complexity:** $\mathcal{O}(|s|)$ to store the output string, along with $\mathcal{O}(1)$ auxiliary space for the frequency array of size 26.
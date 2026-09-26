# Problem Number - 1291A - Even But Not Even

**Problem Link:** [https://codeforces.com/problemset/problem/1291/A](https://codeforces.com/problemset/problem/1291/A)

---

## Topics
- Strings
- Greedy
- Math

## Constraints
- $1 ≤ t ≤ 100$ (Number of test cases)
- $1 ≤ n ≤ 3000$ (Length of the string)
- The sum of `n` over all test cases does not exceed 3000.
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks us to find a subsegment (or rather, a number formed by deleting some digits) of a given large number represented as a string such that the new number is **odd** but the sum of its digits is **even**.
- Since an integer is odd if and only if its last digit is odd, the chosen number must end with an odd digit.
- Since the sum of its digits must be even, and the sum of an odd number of odd terms is odd (while an even number of odd terms yields an even sum), we need to select an even count of odd digits from the string.
- The simplest approach is to scan through the string and pick the first two odd digits we encounter. 
- If we can find at least two odd digits, their concatenation forms a two-digit number that is odd (ends with an odd digit) and has an even digit sum (sum of two odd numbers is even).
- If fewer than two odd digits exist in the string, it's impossible to satisfy the condition, so we output `-1`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per test case, as we iterate through the string of length `n` at most once.
- **Space Complexity:** $O(1)$ auxiliary space (excluding storage for the input string and output result).
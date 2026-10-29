# Problem Number - 1295A Display The Number

**Problem Link:** [https://codeforces.com/problemset/problem/1295/A](https://codeforces.com/problemset/problem/1295/A)

---

## Topics
- Greedy
- Implementation
- Math

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $2 \le n \le 10^5$ (Total number of segments across all test cases doesn't exceed $10^5$)
- Time limit per test: 1.0 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- To form the largest possible number using a fixed number of segments $n$, the length of the number (number of digits) should be maximized first. Since digits are compared from left to right, having more digits always makes a number larger.
- Among all digits, '1' requires the fewest segments (2 segments), and '7' requires 3 segments. 
- To maximize the number of digits with $n$ segments, we should use as many '1's as possible since each '1' takes only 2 segments.
- If $n$ is odd, we can use one '7' (which costs 3 segments) at the beginning, reducing $n$ by 3, and then fill the rest with '1's (each taking 2 segments).
- If $n$ is even, we can entirely form the number using only '1's.
- This greedy choice guarantees the maximum number of digits and puts the larger digit ('7') at the most significant position if $n$ is odd.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ per test case, for constructing and printing the string of digits.
- **Space Complexity:** $\mathcal{O}(n)$ to store the output string, or $\mathcal{O}(1)$ auxiliary space if printed iteratively.
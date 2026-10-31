# Problem Number - 501A Contest

**Problem Link:** [https://codeforces.com/problemset/problem/501/A](https://codeforces.com/problemset/problem/501/A)

---

## Topics
- Implementation
- Math

## Constraints
- $a, b, c, d$ are integers 
- $250 \le a, b \le 3500$
- $0 \le c, d \le 180$
- Time limit per test: 1.0 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem compares the performance of two participants, Vasya and Misha, in a contest based on their points and time spent.
- For each participant, their final score is calculated as the maximum of two values:
  1. $\frac{3a}{10}$ (or $\frac{3b}{10}$)
  2. $a - \frac{a}{250} \times c$ (or $b - \frac{b}{250} \times d$), where $a$ (or $b$) is the initial score and $c$ (or $d$) is the time spent in minutes.
- Note that integer division should be used as specified in the problem statement.
- After calculating Vasya's and Misha's scores, we compare them:
  - If Vasya's score is greater, output "Vasya".
  - If Misha's score is greater, output "Misha".
  - If both scores are equal, output "Tie".

## Time and Space Complexity
- **Time Complexity:** $O(1)$, because it only involves a few basic arithmetic operations and comparisons.
- **Space Complexity:** $O(1)$, as only a few variables are used to store the input values and calculated scores.
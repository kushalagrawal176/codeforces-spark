# Problem Number - 1916B Two Divisors

**Problem Link:** [https://codeforces.com/problemset/problem/1916/B](https://codeforces.com/problemset/problem/1916/B)

---

## Topics
- Math
- Number Theory

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $1 \le a < b \le 10^9$
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
The problem requires us to find a positive integer $n$ ($n \le 10^{9}$) such that its two largest proper divisors are exactly $a$ and $b$. 

We can split this into two distinct mathematical cases based on the relationship between $a$ and $b$:

- **Case 1: $b$ is divisible by $a$ ($b \pmod a == 0$)**
  If $b$ is a multiple of $a$, it means $a$ is already a divisor of $b$. For $b$ to remain the second largest divisor of $n$, $n$ must be scaled up by the exact same ratio that separates $b$ and $a$. Thus, $n = b \times \frac{b}{a}$.

- **Case 2: $b$ is not divisible by $a$ ($b \pmod a \neq 0$)**
  If $b$ does not divide $a$, the least common multiple ($\text{LCM}$) of $a$ and $b$ will organically have $a$ and $b$ as its two largest proper divisors. Thus, $n = \text{LCM}(a, b)$, which can be calculated using the Greatest Common Divisor ($\text{GCD}$) formula: 
  $$\text{LCM}(a, b) = \frac{a \times b}{\text{GCD}(a, b)}$$

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(\log(\min(a, b)))$ per test case due to the Euclidean algorithm used for computing the $\text{GCD}$.
- **Space Complexity:** $\mathcal{O}(1)$ auxiliary space as the solution only requires a few local variables to process inputs on the fly.
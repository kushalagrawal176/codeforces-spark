# Problem Number - 1567B MEXor Mixup

**Problem Link:** [https://codeforces.com/problemset/problem/1567/B](https://codeforces.com/problemset/problem/1567/B)

---

## Topics
- Bit manipulation
- Math
- Greedy

## Constraints
- $1 \le t \le 5 \cdot 10^4$ (number of test cases)
- $1 \le a \le 3 \cdot 10^5$ (desired MEX)
- $0 \le b \le 3 \cdot 10^5$ (desired XOR sum)
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- **Understanding MEX:** The minimum excluded value (MEX) of the array must be `a`. This means the array **must** contain every integer from $0$ to $a - 1$, and it **must not** contain `a` initially. Thus, the array's minimum initial length is `a`.
- **Prefix XOR:** Compute the XOR sum of all elements from $0$ to $a - 1$. Since $a$ can be up to $3 \cdot 10^5$, calculating this naively for every test case would result in TLE. We can compute the prefix XOR in $O(1)$ time using the cyclic property of numbers modulo 4.
- **Handling cases based on current XOR sum:**
  1. **Case 1 (`current_xor == b`):** The array $[0, 1, \dots, a-1]$ already has a total XOR sum of `b`. Minimum elements required = **`a`**.
  2. **Case 2 (`(current_xor ^ b) == a`):** We need an extra element $`x = \text{current\_xor} \oplus b`$ to make the overall XOR equal to `b`. However, $x = a$ is forbidden because adding `a` would change the MEX! To work around this, we append two numbers whose XOR is equal to $x$ (for example, $a \oplus 1$ and $1$). Minimum elements required = **`a + 2`**.
  3. **Case 3 (`current_xor != b` and `(current_xor ^ b) != a`):** We can simply append a single element $`x = \text{current\_xor} \oplus b`$. Since $x \neq a$, the MEX remains `a` and the total XOR sum becomes `b`. Minimum elements required = **`a + 1`**.

## Time and Space Complexity
- **Time Complexity:** $O(1)$ per testcase
- **Space Complexity:** $O(1)$, requiring only constant auxiliary space.
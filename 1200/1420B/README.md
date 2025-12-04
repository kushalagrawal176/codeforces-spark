# Problem Number - 1420B Rock and Lever

**Problem Link:** [https://codeforces.com/problemset/problem/1420/B](https://codeforces.com/problemset/problem/1420/B)

---

## Topics
- Bit Manipulation
- Implementation
- Math

## Constraints
- 1 ≤ `t` ≤ 10 (number of test cases)
- 1 ≤ `n` ≤ 10^5 (number of elements per test case)
- 1 ≤ `a[i]` ≤ 10^9
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The condition to check is: 

    a_i & a_j >= a_i ^ a_j

    where `&` is bitwise AND and `⊕` is bitwise XOR.
- **Key Observation:**  
  This inequality holds **only if both numbers share the same highest set bit (MSB)**.
  - If two numbers have different MSBs, their XOR will set the higher bit, making XOR larger than AND.
  - If they share the same MSB, their AND keeps that bit set while XOR does not, ensuring AND ≥ XOR.
- **Approach:**
  1. Group numbers by their most significant bit position.
  2. For each group of size `k`, the number of valid pairs is:
     

        C(k, 2) = (k * (k - 1)) / 2


  3. Sum over all groups to get the final answer.

## Time and Space Complexity
- **Time Complexity:** `O(n)` per test case, since we only group numbers by MSB and count pairs.
- **Space Complexity:** `O(32) ≈ O(1)`, for storing counts of numbers per MSB position.

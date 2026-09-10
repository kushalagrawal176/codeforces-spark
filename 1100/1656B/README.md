# Problem Number - 1656B Subtract Operation

**Problem Link:** [https://codeforces.com/problemset/problem/1656/B](https://codeforces.com/problemset/problem/1656/B)

---

## Topics
- Hashing
- Data Structures
- Sorting / Two Pointers
- Greedy

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $2 \le n \le 2 \times 10^5$ (length of the array)
- $1 \le k \le 10^9$ (target difference)
- $-10^9 \le a_i \le 10^9$ (array elements)
- Sum of $n$ over all test cases does not exceed $2 \times 10^5$.
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem asks whether we can reduce the array to a single element with a value equal to $k$ by repeatedly choosing an element $x$, erasing it, and subtracting $x$ from all remaining elements.
- Notice that if we are left with a single element, say it was derived from two initial elements $a_i$ and $a_j$ (where $a_i > a_j$), the operation of subtracting $a_j$ when $a_i$ is present effectively results in the absolute difference $a_i - a_j$ (or vice versa). 
- More generally, if we can reach a state where the final remaining element is $k$, it implies that there must exist two elements in the initial array, $a_i$ and $a_j$, such that their difference equals $k$ (i.e., $a_i - a_j = k$ or $a_j - a_i = k$, which simplifies to checking if $a_i - k$ exists in the array for any element $a_i$).
- Special case: If $n = 1$, we can only check if the single element itself is equal to $k$.
- We can efficiently solve this by inserting all elements into a Hash Set and then checking for each element $a_i$ whether $a_i - k$ exists in the set.

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n)$ on average per test case, using a hash set to check for the existence of $a_i - k$.
- **Space Complexity:** $\mathcal{O}(n)$ per test case, to store the array elements and hash set.
# Problem Number - 1842B Tenzing and Books

**Problem Link:** [https://codeforces.com/problemset/problem/1842/B](https://codeforces.com/problemset/problem/1842/B)

---

## Topics
- Bitmasks
- Greedy
- Math

## Constraints
- $1 \le t \le 10^4$ (number of test cases)
- $1 \le n \le 10^5$ (the number of books in each stack)
- $0 \le x < 10^9$ (Tenzing's favourite number)
- $0 \le a_i, b_i, c_i < 10^9$ (difficulty rating of the books)
- Time limit per test: 1 second
- Memory limit per test: 256 megabytes

## Intuition / Approach
- Tenzing wants to achieve a bitwise OR sum of $x$ by removing books from the top of three given stacks.
- A book can only be removed and its knowledge acquired if all bits present in that book's value are also present in $x$. If a book contains any bit that is *not* set in $x$, we must stop reading from that stack immediately because bitwise OR operations can only turn bits on, never off.
- We iterate through the three stacks sequentially. For each stack, we process books from the top (beginning) and keep a running bitwise OR sum `c`. 
- If a book has any bit not present in $x$ (checked via `(a[j] | x) != x`), we stop processing that stack.
- Otherwise, we update our accumulated OR sum `c |= a[j]` and continue to the next book.
- Finally, if the accumulated OR sum `c` equals $x$, we can successfully achieve the target knowledge level, so output `"YES"`; otherwise, output `"NO"`.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ per testcase, since we iterate through each of the 3 stacks of size $n$ at most once.
- **Space Complexity:** $O(n)$ to store the array for the current stack processing (or $O(1)$ auxiliary space if done by streaming inputs without full array storage).
# Problem Number - 1955B Progressive Square

**Problem Link:** [https://codeforces.com/problemset/problem/1955/B](https://codeforces.com/problemset/problem/1955/B)

---

## Topics
- Constructive Algorithms
- Implementation
- Sorting
- Matrices

## Constraints
- $1 \le t \le 10^4$ (Number of test cases)
- $2 \le n \le 500$ (Dimension of the square)
- $1 \le c, d \le 10^6$ (Row and column progression constants)
- $1 \le a_{i,j} \le 10^9$ (Elements of the square)
- The sum of $n^2$ over all test cases does not exceed $2.5 \cdot 10^5$.
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- A progressive square is uniquely determined by its top-left element $a_{1,1}$, the row-progression constant $c$, and the column-progression constant $d$.
- Since all elements in the grid grow positively from $a_{1,1}$ (because $c, d \ge 1$), the smallest element in the entire given sequence $b$ must be the top-left element $a_{1,1}$.
- Sorting the input array $b$ allows us to easily extract the minimum element: $a_{1,1} = b[0]$.
- Using this starting element, we can reconstruct the full expected progressive square of size $n \times n$ using the rules:
  - $a_{i+1, j} = a_{i, j} + c$
  - $a_{i, j+1} = a_{i, j} + d$
- After constructing the expected square, we flatten it into a 1D array, sort it, and compare it element-by-element with the sorted input array $b$.
- If every element matches perfectly, the input sequence can form a progressive square (`YES`); otherwise, it cannot (`NO`).

## Time and Space Complexity
- **Time Complexity:** $\mathcal{O}(n^2 \log(n^2))$ per test case. Sorting the input array of size $n^2$ and the reconstructed array takes $\mathcal{O}(n^2 \log(n^2))$ time. Building the square takes $\mathcal{O}(n^2)$ time. 
- **Space Complexity:** $\mathcal{O}(n^2)$, used to store the input elements and the reconstructed progressive square elements.
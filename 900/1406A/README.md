# Problem Number - 1406A Subset Mex

**Problem Link:** [https://codeforces.com/problemset/problem/1406/A](https://codeforces.com/problemset/problem/1406/A)

---

## Topics
- Greedy
- Implementation
- Sorting

## Constraints
- $1 \le t \le 100$ (number of test cases)
- $1 \le n \le 100$ (size of the array)
- $0 \le a_i \le 100$ (elements of the array)
- Time limit per test: 1 second
- Memory limit per test: 512 megabytes

## Intuition / Approach
- The problem asks us to split a given multiset into two subsets such that the sum of the **MEX** (Minimum Excluded) of both subsets is maximized.
- To maximize the MEX of a subset, we want each consecutive integer starting from $0$ ($0, 1, 2, \dots$) to be present in it. 
- We can count the frequency of each element in the array. 
- For the first subset, we look for the first missing element (frequency is $0$). That missing element will be its MEX.
- For the second subset, we can continue searching from where we left off or check elements with a frequency of less than $2$. More simply, any element that appears at least twice can contribute to both subsets, while elements appearing once can only contribute to the first subset.
- By greedily assigning elements, we can find the MEX for both subsets independently and add them up.

## Time and Space Complexity
- **Time Complexity:** $O(n + \max(A))$, where $n$ is the size of the array and $\max(A)$ is the maximum value in the array ($100$ in this case), making it practically $O(n)$ per test case.
- **Space Complexity:** $O(\max(A))$ or $O(1)$ auxiliary space to store the frequency array of size $101$.
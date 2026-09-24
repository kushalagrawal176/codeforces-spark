# Problem Number - 918B Radio Station

**Problem Link:** [https://codeforces.com/problemset/problem/918/B](https://codeforces.com/problemset/problem/918/B)

---

## Topics
- Implementation
- Strings
- Data Structures (Hash Maps / Maps)

## Constraints
- $1 \le n, m \le 1000$ (number of servers and requests)
- Time limit per test: 2 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem provides $n$ server names along with their respective IP addresses.
- It then gives $m$ commands or queries, each consisting of a server name and an IP address (with a trailing semicolon).
- For each query, we need to find which server corresponds to the given IP address and print the command followed by the matched server's name in comments (`#name`).
- We can use a hash map (`std::map` or `std::unordered_map` in C++) to store the IP addresses as keys and their corresponding server names as values for quick lookups.
- While reading the input server list, map each IP address to its name. Then, for each request, lookup the IP address in the map to retrieve and display the associated server name.

## Time and Space Complexity
- **Time Complexity:** $O((n + m) \cdot \text{length of string})$, for inserting into and querying the map.
- **Space Complexity:** $O(n \cdot \text{length of string})$, to store the server names and IP addresses in the map.
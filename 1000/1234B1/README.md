# Problem Number - 1234B1 Social Network (easy version)

**Problem Link:** [https://codeforces.com/problemset/problem/1234/B1](https://codeforces.com/problemset/problem/1234/B1)

---

## Topics
- Data Structures
- Implementation
- Simulation

## Constraints
- $1 \le n, k \le 200$
- $1 \le id_i \le 10^9$
- Time limit per test: 2.0 seconds
- Memory limit per test: 256 megabytes

## Intuition / Approach
- The problem simulates a smartphone screen showing up to $k$ most recent conversations from $n$ incoming messages.
- For each incoming message from user $id_i$:
  - If $id_i$ is **already displayed** on the screen, ignore the message.
  - If $id_i$ is **not on the screen**:
    - If the screen already displays $k$ conversations, remove the oldest conversation from the bottom.
    - Insert $id_i$ at the top of the screen.
- We can maintain the screen state using a double-ended queue (`std::deque`) to support fast $O(1)$ insertions at the front and removals from the back.
- A hash set (`std::unordered_set`) is used alongside the deque to check whether a user ID is currently displayed in $O(1)$ average time.

## Time and Space Complexity
- **Time Complexity:** $O(n)$ average time, where $n$ is the number of messages. Searching, inserting, and deleting from the queue/hash set take $O(1)$ expected time per message.
- **Space Complexity:** $O(k)$ to store at most $k$ active conversations on the screen in both the queue and set.
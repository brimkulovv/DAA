## Problem
The task is to remove every node whose value equals a given target value and return the updated list.

## Approach
I create a dummy node before the original head. This simplifies the removal of nodes at the beginning of the
list. The pointer current examines the node after it. If that node contains the target value, I skip it.
Otherwise, I move current forward. Finally, I return dummy.next, which points to the new head.

## Step-by-step
Input: 6 -> 1 -> 6 -> 2 -> 6, target: 6

The first node contains 6, so it is skipped.
The node containing 1 is retained.
The next node contains 6, so it is skipped.
The node containing 2 is retained.
The final node contains 6, so it is skipped.

Output: 1 -> 2

## Complexity
Time Complexity: O(n)
The algorithm traverses the list once. Each node requires a constant amount of work.
Space Complexity: O(1)
The algorithm creates one dummy node and uses a constant number of pointers.

## Reflection/Improvement
The solution is already asymptotically optimal because the list must be examined to identify all matching
nodes. It achieves O(n) time and O(1) extra space.
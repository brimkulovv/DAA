## Problem
The task is to remove duplicate values from a sorted linked list. Each value should appear only once, and the
original order must be preserved.
## Approach 
I use one pointer called current to traverse the list. Since the list is sorted, duplicate values are adjacent.

If current.val equals current.next.val, I skip the next node by updating current.next. Otherwise, I move
current to the next node.
## Step-by-Step
Input: 1 -> 1 -> 2 -> 3 -> 3

Compare the first two nodes. Both contain 1, so skip the second node.
Compare 1 and 2. They differ, so move forward.
Compare 2 and 3. They differ, so move forward.
Compare the two nodes containing 3. Skip the second one.
The traversal ends.

Output: 1 -> 2 -> 3

## Complexity
Time Complexity: O(n)
The algorithm traverses the list once. Each iteration performs a constant amount of work.

Space Complexity: O(1)
Only a constant number of pointer variables are used. The existing nodes are modified without creating a new
collection.

## Reflection/Improvement
The solution is already asymptotically optimal. A linked list must be inspected to determine which duplicates
need to be removed. The solution uses linear time and constant extra space.
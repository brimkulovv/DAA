## Problem
The task is to check whether a linked list contains a cycle. A cycle means that some node points back to a 
previous node instead of pointing to null. If it has program should return true otherwise false. 

## Approach
I use two pointers: slow, fast. Both start from the head of the list. The slow pointer moves one node at a time. 
The fast pointer moves two nodes at a time. If there is no cycle, fast will eventually reach null. If there is
a cycle, fast will move around the cycle and eventually meet slow.

## Step-by-step
Input: 3 -> 2 -> 0 -> -4 (where -4 points back to 2)

Start: slow = 3, fast = 3
Step 1: slow goes to 2, fast goes to 0. No match.
Step 2: slow goes to 0, fast goes to 2 (loops back). No match.
Step 3: slow goes to -4, fast goes to -4. Match found!
Result: true (cycle detected).

## Complexity
Time Complexity: O(n). In the worst case, the pointers need to move through the linked list until they either 
meet or reach the end.

Space Complexity: O(1). I use only two pointer variables.
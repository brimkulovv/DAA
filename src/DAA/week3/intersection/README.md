## Problem
The task is to find the node where two singly linked lists intersect. If they do not intersect, the method must
return null.

## Approach
I use two nested loops. The outer loop visits each node in the first list. For every node in the first list,
the inner loop visits every node in the second list.
If both pointers refer to the same node, I return that node. If no matching node is found, I return null.

## Step-by-step
Suppose the lists are:
List A: 4 -> 1 -> 8 -> 4 -> 5
List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5

The nodes starting at 8 are shared.
Take the first node of list A.
Compare it with every node in list B.
Repeat for the next node in list A.
Continue until both pointers refer to the same node, which contains 8.
Return that shared node.

## Complexity
Time Complexity: O(m * n)
If the first list has m nodes and the second has n nodes, each node in the first list may require checking 
all nodes in the second list.
Space Complexity: O(1)
The algorithm uses only a constant number of pointer variables.

## Reflection/Improvement
A more efficient approach uses two pointers. Each pointer traverses its own list and then switches to the other
list's head when it reaches the end.
The improved solution achieves O(m + n) time and O(1) extra space.
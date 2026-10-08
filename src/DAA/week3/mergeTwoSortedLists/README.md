## Problem. The task is to merge two sorted linked lists into one sorted linked list. 

## Approach. 
1. Create dummy and current.
2. Compare the current values of list1 and list2.
3. Take the smaller value and add that node to the result.
4. Move the pointer of the list from which I took the node.
5. Move current to the new last node.
6. When one list becomes empty, attach the remaining part of the other list.
7. Return dummy.next, because dummy itself is not part of the result.

## Step-by-step example
Input: list1 = [1, 2, 4], list2 = [1, 3, 4]
Init: dummy = 0, current at dummy

1. Compare 1 and 1: pick from list1. Merged: 0 -> 1
2. Compare 2 and 1: pick from list2. Merged: 0 -> 1 -> 1
3. Compare 2 and 3: pick from list1. Merged: 0 -> 1 -> 1 -> 2
4. Compare 4 and 3: pick from list2. Merged: 0 -> 1 -> 1 -> 2 -> 3
5. Compare 4 and 4: pick from list1. Merged: 0 -> 1 -> 1 -> 2 -> 3 -> 4
6. list1 is empty. Append remaining list2 (4).

Final result: 1 -> 1 -> 2 -> 3 -> 4 -> 4

## Complexity
Time Complexity is O(n + m)

Here n is the number of nodes in the first list and m is the number of nodes in the second list.
In the worst case, I check every node from both lists once.

Space Complexity: O(1)

I do not create a new node for every element. 

## Reflection/Improvement

The solution is already efficient because both lists are sorted. Probably it is possible to solve this using 
recursion, but my solution is a bit easier.
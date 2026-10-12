## Problem
The task is to determine whether a singly linked list reads the same forward and backward.
## Approach
I copy the values of the linked list into an ArrayList. This allows me to access values from both ends. I use
two pointers: left starts at the first index, and right starts at the last index. If the corresponding
values differ, the method returns false. Otherwise, both pointers move toward the center. If every pair
matches, the method returns true.
## Step-by-step
Input: 1 -> 2 -> 2 -> 1
The stored values are [1, 2, 2, 1].
Compare the first and last values: 1 == 1.
Move both pointers toward the center.
Compare the middle pair: 2 == 2.
All pairs match, so return true.
## Complexity
Time Complexity: O(n)
Copying the values takes O(n) time. Comparing pairs takes at most O(n) additional time. Therefore, the total complexity is O(n).

Space Complexity: O(n)
The ArrayList stores all n values from the linked list.

## Reflection/Improvement
A more space-efficient solution uses the fast and slow pointer technique to find the middle of the list, 
reverses the second half, and compares the two halves.
This reduces extra space from O(n) to O(1), while keeping O(n) time complexity. The trade-off is a more 
complex implementation that modifies the list temporarily.

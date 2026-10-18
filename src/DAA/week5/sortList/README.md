## Problem
The task is to sort the nodes of a singly linked list in ascending order.

Unlike an array, a linked list does not provide direct access to an element by its index. Therefore, the
algorithm must navigate through the nodes using pointers.

## Approach
Here I also used merge sort. First, I find the middle of the linked list using two pointers:slow and fast.
When fast reaches the end, slow is around the middle of the list. I use another pointer, prev, to disconnect
the first half from the second half.Then, I recursively sort both halves and merge them into one sorted list.

## Step-by-Step
Step 1: Divide the list
The list is divided into two parts:
4 → 2 → null
1 → 3 → null
Step 2: Sort each half
The first half becomes:
2 → 4 → null
The second half becomes:
1 → 3 → null
Step 3: Merge the sorted lists
Compare 2 and 1: choose 1.
Compare 2 and 3: choose 2.
Compare 4 and 3: choose 3.
Append the remaining node 4.
Final result: 1 → 2 → 3 → 4 → null

## Complexity
Time Complexity: O(n log n)
Each recursive level divides the list into two approximately equal parts. Merging the two sorted halves
requires O(n) time because each node is processed a constant number of times per level. There are O(log n)
levels of recursion. So, the overall time complexity is O(n log n).

Space Complexity: O(log n)
The recursive calls require O(log n) stack space because the list is divided approximately in half at each
level. The merge operation reuses the existing list nodes and requires only O(1) auxiliary pointer variables.
It does not allocate a separate array of size n. So, the auxiliary space complexity is O(log n), excluding the 
input list itself.

## Reflection / Improvement
As I see it, there isn't much room for significant overall improvement here; while using recursion might
potentially make the code more efficient, I feel it would also make it harder to read, especially in the
context of a linked list.
## Problem
Here we had to sort an array in ascending order. 

## Approach
I used merge sort. First, I divide the array into two halves. I recursively sort both halves until each part
contains only one element.Next, I merge the sorted halves by comparing their elements and placing the smaller
element into a temporary array. After merging, I copy the sorted elements back into the original array.

## Step-by-Step
Input: [5, 2, 3, 1]
Step 1: Divide
[5, 2, 3, 1]
The array is divided into:
[5, 2] and [3, 1]
These parts are divided again:
[5], [2], [3], [1]
Step 2: Sort and merge the smaller parts
[5] + [2] becomes [2, 5]
[3] + [1] becomes [1, 3]
Step 3: Merge the sorted halves
Merge [2, 5] and [1, 3].
Compare 2 and 1 - 1.
Compare 2 and 3 - 2.
Compare 5 and 3 - 3.
Append the remaining element 5.
Final result: [1, 2, 3, 5]

## Complexity
Time Complexity: O(n log n)
The array is divided into halves at each recursive level, producing approximately log n levels. At each level ,
merging processes all n elements in total, taking O(n) time.

Space Complexity: O(n)
The algorithm uses a temporary array of size n. The recursive call stack requires O(log n) additional space.
The temporary array dominates the memory usage, so the total auxiliary space complexity is O(n).

## Reflection/Improvement
Merge Sort already achieves O(n log n) time complexity, which is asymptotically optimal for comparison-based
sorting in the general case.
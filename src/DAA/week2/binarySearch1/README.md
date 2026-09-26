1. Problem. The goal of this leetcode task is to find the index of a target value. 
2. Approach. I used just a simple linear search. This algorithm checks all the integers one by one. If it finds a target value
method search returns an index of that integer. Otherwise it returns -1.
3. Time Complexity. Time complexity for my linear solution is a O(n). In the worst case, algorithm checks every element
of the array. 
4. Space Complexity. It is O(1) because the algorithm uses only a constant variables. 
5. Reflection/Improvement. Linear search super simple, but its time complexity is not good enough. So the best solution
for this task is a binary search because using this algorithm we get O(logn)
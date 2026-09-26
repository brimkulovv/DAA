1. Problem. Here we are going to find the first bad version of product.Since each version is developed based on the
previous version, all the versions after a bad version are also bad. 
2. Approach. here I also use a linear search. I used for loop and isBadVersion boolean method inside. As soon as it gets
true, the program returns its number. 
3. Time complexity. Time complexity is O(n). In the worst case, algorithm checks every element of the array.
4. Space Complexity. It is O(1) because the algorithm uses only a constant variables. 
5. Reflection/Improvement. Here we also can integrate binary search. If we use binary search instead of linear search,
we get an improvement from O(n) to O(logn).
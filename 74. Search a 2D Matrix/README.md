# 74. Search a 2D Matrix

### Description

Write an efficient algorithm that searches for a value in an *m* x *n* matrix. This matrix has the following properties:

- Integers in each row are sorted from left to right.
- The first integer of each row is greater than the last integer of the previous row.

**Example 1:**

```
Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 3
Output: true
```

**Example 2:**

```
Input:
matrix = [
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
target = 13
Output: false
```



### Solution

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int lo = 0;
        int hi = matrix.length * matrix[0].length - 1;
        int mid = lo + (hi - lo) / 2;
        while(matrix[mid/matrix[0].length][mid%matrix[0].length] != target) {
            if(lo >= hi) return false;
            else if(matrix[mid/matrix[0].length][mid%matrix[0].length] > target) {
                hi = mid - 1;
                mid = lo + (hi - lo) / 2;
            }
            else
            {
                lo = mid + 1;
                mid = lo + (hi - lo) / 2;
            }
        }
        return true;
    }
}
```

Basically using binary search is pretty fast. But my code writing is too verbose. It can be much much more simple.

Pay attention the first line to avoid **[]** and **[[]]** cases.



### TODO

Think about how to sort a 2D matrix with more complicated restrains.
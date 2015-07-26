#Restaurant#

###Problem Statement###

Martha is interviewing at Subway. One of the rounds of the interview requires her to cut a bread of size l×b into smaller identical pieces such that each piece is a square having maximum possible side length with no left over piece of bread.

###Input format###
The first line contains an integer T. T lines follow. Each line contains two space separated integers l and b which denote length and breadth of the bread.

###Output format###

T lines, each containing an integer that denotes the number of squares of maximum size, when the bread is cut as per the given condition.

###Constraints###

1 <= T <= 1000  
1 <= l, b <= 1000  

###Sample Input###
```
2
2 2
6 9
```
###Sample Output###
```
1
6
```
###Explanation###

The 1st testcase has a bread whose original dimensions are 2×2, the bread is uncut and is a square. Hence the answer is 1.
The 2nd testcase has a bread of size 6×9. We can cut it into 54 squares of size 1×1, 0 of size 2×2, 6 of size 3×3, 0 of size 4×4, 0 of size 5×5 and 0 of size 6×6. The number of squares of maximum size that can be cut is 6.

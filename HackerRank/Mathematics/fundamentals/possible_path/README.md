#Possible Path#


###Problem Statement###

Adam is standing at point (a,b) in an infinite 2D grid. He wants to know if he can reach point (x,y) or not. The only operation he can do is to move to point (a+b,b), (a,a+b), (a-b,b), or (a,a-b) from some point (a,b). It is given that he can move to any point on this 2D grid,i.e., the points having positive or negative X(or Y) co-ordinates.

Tell Adam whether he can reach (x,y) or not.

###Input Format###
The first line contains an integer, T, followed by T lines, each containing 4 space separated integers i.e. a b x y

###Output Format###
For each test case, display YES or NO that indicates if Adam can reach (x,y) or not.

###Constraints###
1 ≤ T ≤ 1000  
1 ≤ a,b,x,y ≤ 10<sup>18</sup>

###Sample Input###
```
3
1 1 2 3
2 1 2 3
3 3 1 1
```
###Sample Output###
```
YES
YES
NO
```
###Explanation###

    (1,1) -> (2,1) -> (2,3).


#Equal#

###Problem Statement###

Christy is interning at HackerRank. One day she has to distribute some chocolates to her colleagues. She is biased towards her friends and may have distributed the chocolates unequally. One of the program managers gets to know this and orders Christy to make sure everyone gets equal number of chocolates.  

But to make things difficult for the intern, she is ordered to equalize the number of chocolates for every colleague in the following manner,  

For every operation, she can choose one of her colleagues and can do one of the three things.  
(i) She can give one chocolate to every colleague other than chosen one.  
(ii) She can give two chocolates to every colleague other than chosen one.  
(iii) She can give five chocolates to every colleague other than chosen one.  

Calculate minimum number of such operations needed to ensure that every colleague has the same number of chocolates.  

###Input Format###

First line contains an integer T denoting the number of testcases. T testcases follow.
Each testcase has 2 lines. First line of each testcase contains an integer N denoting the number of co-interns. Second line contains N space separated integers denoting the current number of chocolates each colleague has.

###Output Format###

T lines, each containing the minimum number of operations needed to make sure all colleagues have the same number of chocolates.

###Constraints###

1<=T<=100  
1<=N<=10000  
Number of initial chocolates each colleague has < 1000  

###Sample Input###
```
1
4
2 2 3 7
```
###Sample Output###
```
2
```
###Explanation###

1st operation: Christy increases all elements by 1 except 3rd one  
2 2 3 7 -> 3 3 3 8  
2nd operation: Christy increases all element by 5 except last one  
3 3 3 8 -> 8 8 8 8  

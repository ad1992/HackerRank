###Problem Statement###

A word from the English dictionary is taken and arranged as a matrix. e.g. "MATHEMATICS"
```
MATHE  
ATHEM  
THEMA  
HEMAT  
EMATI  
MATIC  
ATICS  
```
There are many ways to trace this matrix in a way that helps you construct this word. You start tracing the matrix from the top-left position and at each iteration, you either move RIGHT or DOWN, and ultimately reach the bottom-right of the matrix. It is assured that any such tracing generates the same word. How many such tracings can be possible for a given word of length m+n-1 written as a matrix of size m * n?

###Input Format###

The first line of input contains an integer T. T test cases follow.  
Each test case contains 2 space separated integers m & n (in a new line) indicating that the matrix has m rows and each row has n characters.  

###Constraints###
1 <= T <= 10<sup>3<sup>  
1 ≤ m,n ≤ 10<sup>6<sup>  

###Output Format###
Print the number of ways (S) the word can be traced as explained in the problem statement. If the number is larger than 109+7,
print S mod (10^9 + 7) for each testcase (in a new line).  

###Sample Input###
```
1
2 3
```
###Sample Output###
```
3
```
###Explanation###
Let's consider a word AWAY written as the matrix
```
AWA
WAY
```
Here, the word AWAY can be traced in 3 different ways, traversing either RIGHT or DOWN.

```
AWA
  Y

AW
 AY

A
WAY
```
Hence the answer is 3.
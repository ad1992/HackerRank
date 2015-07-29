###Problem Statement###

You are given an integer, N. Write a program to determine if N is an element of the Fibonacci sequence.

The first few elements of the Fibonacci sequence are 0,1,1,2,3,5,8,13,⋯. A Fibonacci sequence is one where every element is a sum of the previous two elements in the sequence. The first two elements are 0 and 1.

Formally:

fib<sub>0</sub>=0
fib<sub>1</sub>=1
⋮
fib<sub>n</sub>=fib<sub>n−1</sub>+fib<sub>n−2</sub>∀n>1

###Input Format###
The first line contains T, number of test cases.  
T lines follow. Each line contains an integer N.  

###Output Format###
Display IsFibo if N is a Fibonacci number and IsNotFibo if it is not.  
The output for each test case should be displayed in a new line.  

###Constraints###

1≤T≤10<sup>5</sup>
1≤N≤10<sup>10</sup>

###Sample Input###
```
3
5
7
8
```
###Sample Output###
```
IsFibo
IsNotFibo
IsFibo
```
###Explanation###
5 is a Fibonacci number given by fib<sub>5</sub>=3+2  
7 is not a Fibonacci number  
8 is a Fibonacci number given by fib<sub>6</sub>=5+3  
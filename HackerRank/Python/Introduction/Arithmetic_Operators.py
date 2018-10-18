#!/usr/bin/python2

# Enter your code here. Read input from STDIN. Print output to STDOUT
'''
Problem link : https://www.hackerrank.com/challenges/python-arithmetic-operators/problem

Task
Read two integers from STDIN and print three lines where:
(1) the first line contains the sum of the two numbers,
(2) the second line contains the difference of the two numbers (first - second),
(3) the third line contains the product of the two numbers.

Input Format
The first line contains the first integer, a, and the second line contains the second integer, b.
Output Format
Print three lines as explained above.
'''
a=(int)(raw_input())
b=(int)(raw_input())
print a+b
print a-b
print a*b

#!/usr/bin/env python
'''
Problem link : https://www.hackerrank.com/challenges/python-mod-divmod/problem?h_r=internal-search
Task
Read two integers, a and b, and print three lines.
The first line is the integer division a//b (Remember to import division from __future__)
The second line is the result of a%b. (Modulo operator)
In the third line print the divmod of a and b.

Input Format
The first line contains the first integer, a, and the second line contains the second integer, b.

Output Format
Print the result as described above.
'''
# Enter your code here. Read input from STDIN. Print output to STDOUT
a=(int)(raw_input())
b=(int)(raw_input())
print a//b
print a%b
print divmod(a,b)

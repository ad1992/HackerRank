#!/usr/bin/env python2

'''
Problem link : https://www.hackerrank.com/challenges/python-division/problem?h_r=internal-search

Task
Read two integers and print two lines, such that the first line contains integer division and the second line contains float division.

You don't need to perform any rounding or formatting operation.

Input Format
The first line contains the first integer, a, and the second line contains the second integer, b.

Output Format
Print two lines as described above.
'''
# Enter your code here. Read input from STDIN. Print output to STDOUT
a=(int)(raw_input())
b=(int)(raw_input())
print a//b
print a/(b*1.0)

#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Problem link : https://www.hackerrank.com/challenges/python-power-mod-power/problem?h_r=internal-search

Task
You are given three integers; print two lines.
The first line should print pow(a,b), and the second line should print the result of pow(a,b,m).
Input Format
The first line contains a, the second line contains b, and the third line contains m.

Constraints
1≤a≤10
1≤b≤10
2≤m≤1000

Sample Input
3
4
5

Sample Output
81
1
"""
# Enter your code here. Read input from STDIN. Print output to STDOUT
a=(int)(raw_input())
b=(int)(raw_input())
c=(int)(raw_input())
print pow(a,b)
print pow(a,b,c)

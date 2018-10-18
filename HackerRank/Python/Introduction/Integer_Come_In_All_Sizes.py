#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/python-integers-come-in-all-sizes/problem?h_r=internal-search

Problem Statement

Integers in Python can be as big as the bytes in your machine's memory. There is no limit of 231−1 (c++ int) or 263−1 (C++ long long int). Let's try this out.

As we know, the result of ab grows really fast with increasing b.

We will do some caculations on very large integers.

Task
Read four numbers, a, b, c, and d, and print the result of ab+cd.

Input Format
Four numbers are given on four lines.

Constraints
1≤a≤1000
1≤b≤1000
1≤c≤1000
1≤d≤1000

Output Format
Print the result in one line.
'''

# Enter your code here. Read input from STDIN. Print output to STDOUT
a=(int)(raw_input())
b=(int)(raw_input())
c=(int)(raw_input())
d=(int)(raw_input())
print pow(a,b)+pow(c,d)

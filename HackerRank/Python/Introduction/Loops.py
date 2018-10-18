#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/python-loops/problem?h_r=internal-search

Task
Read an integer N. For all non-negative integers i<N, print i2. See the sample for details.

Input Format
The first and only line contains N.

Constraints
1≤N≤20

Output Format
Print N lines, one corresponding to each i.
'''
N=(int)(raw_input())
for i in range(0,N):
    print pow(i,2)

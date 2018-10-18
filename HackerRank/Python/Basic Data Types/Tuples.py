#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/python-tuples/problem?h_r=internal-search

Task
You are given an integer N in one line. The next line contains N space-separated integers. Create a tuple of those N integers. Lets call it T.
Compute hash(T) and print it.

Note hash() is one of the function in __builtins__ module.

Input Format
The first line contains N. The next line contains N space-separated integer values.

Output Format
Print the computed value.
'''
N=int(raw_input())
T=tuple(map(int,raw_input().strip().split(" ")))
print hash(T)

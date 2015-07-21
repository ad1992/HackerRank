#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem Statement

There are N integers in an array A. All but one integer occur in pairs. Your task is to find the number that occurs only once.

Input Format

The first line of the input contains an integer N, indicating the number of integers. The next line contains N space-separated integers that form the array A.

Constraints

1≤N<100
N % 2=1 (N is an odd number)
0≤A[i]≤100,∀i∈[1,N]

Output Format

Output S, the number that occurs only once.
'''
a = input()
b = map(int, raw_input().strip().split(" "))
xor=0
for i in b:
    xor^=i
print xor
    

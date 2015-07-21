#!/usr/bin/env python
# -*- coding: utf-8 -*-
import math
'''
Problem Statement

Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition:

L≤A≤B≤R

Input Format

The input contains two lines; L is present in the first line and R in the second line.

Constraints
1≤L≤R≤103

Output Format

The maximal value as mentioned in the problem statement.
'''
L=int(raw_input())
R=int(raw_input())
xor=L^R
base2=int(math.log(xor,2))
ans=int(math.pow(2, base2+1))-1
print ans


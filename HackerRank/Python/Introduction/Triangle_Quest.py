#!/usr/bin/env python
# -*- coding: utf-8 -*-

'''
Problem link : https://www.hackerrank.com/challenges/python-quest-1/problem?h_r=internal-search
You are given a positive integer N. You have to print a numerical triangle of height N−1 as shown below:

1
22
333
4444
55555
......

'''
for i in range(1,input()): #More than 2 lines will result in 0 score. Do not leave a blank line also
    print (pow(10,i)-1)/9*i

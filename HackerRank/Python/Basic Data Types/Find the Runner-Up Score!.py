#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/find-second-maximum-number-in-a-list/submissions/code/84647807

Problem Statement
Now, lets delve into one of the most basic data types in python, LIST. You are given 'n' numbers. Store them in a list and find the second largest number. Easy enough!
NOTE : Don't use insertion sort
Input Format
First line contains N. Second line contains Array A[] of N integers each separated by a space.
Output Format
Value of the second largest number.
'''

N=int(raw_input())
list=list(set(map(int,raw_input().strip().split(" "))))
list.sort(reverse=True)
print list[1]

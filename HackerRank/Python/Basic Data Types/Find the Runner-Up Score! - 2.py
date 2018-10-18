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

if __name__ == '__main__':
    n = int(input())
    arr =list(map(int, input().split(" ")))
    k = max(arr)
    for i in range(0,n):
        if max(arr) == k:
            arr.remove(max(arr))
    arr.sort(reverse=True)
    print(arr[0])

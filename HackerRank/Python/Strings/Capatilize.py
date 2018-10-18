'''
Problem link: https://www.hackerrank.com/challenges/capitalize/problem
You are asked to ensure that the first and last names of people begin with a capital letter in their passports. For example, alison heck should be capitalised correctly as Alison Heck.

Given a full name, your task is to capitalize the name appropriately.

Input Format

A single line of input containing the full name, .

Constraints

    The string consists of alphanumeric characters and spaces.

Note: in a word only the first character is capitalized. Example 12abc when capitalized remains 12abc.

Output Format

Print the capitalized string, .

Sample Input

chris alan

Sample Output

Chris Alan
'''

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    #k=s.split(" ")
    # l=s.partition(' ')[0]
    # print(l)
    l=list(s)
    l[0]=l[0].upper()
    for i in range(0,len(l)):
        if l[i] == " ":
            l[i+1]=l[i+1].upper()
    l="".join(l)
    return l

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    s = input()
    result = solve(s)
    fptr.write(result + '\n')
    fptr.close()

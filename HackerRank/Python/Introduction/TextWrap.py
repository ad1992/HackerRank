#!/usr/bin/python3.5


'''
Problem link : https://www.hackerrank.com/challenges/text-wrap/problem

Check Tutorial tab to know how to to solve.

You are given a string and width .
Your task is to wrap the string into a paragraph of width .

Input Format

The first line contains a string, .
The second line contains the width, .

Constraints

Output Format

Print the text wrapped paragraph.

Sample Input 0

ABCDEFGHIJKLIMNOQRSTUVWXYZ
4

Sample Output 0

ABCD
EFGH
IJKL
IMNO
QRST
UVWX
YZ

'''

def wrap(string, max_width):
    for i in range(0,len(string),max_width):
        a=print(string[i:max_width+i])
    [x for x in a if x is not None]
    return a

#!/bin/python3

'''
Problem linki : https://www.hackerrank.com/challenges/py-if-else/problem
Check Tutorial tab to know how to to solve.

Task
Given an integer, , perform the following conditional actions:

    If is odd, print Weird
    If is even and in the inclusive range of to , print Not Weird
    If is even and in the inclusive range of to , print Weird
    If is even and greater than , print Not Weird

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3

Sample Output 0

Weird

Explanation 0


is odd and odd numbers are weird, so we print Weird.

Sample Input 1

24

Sample Output 1

Not Weird

Explanation 1


and is even, so it isn't weird. Thus, we print Not Weird.
'''


N = int(input())

if N%2 == 1:
    print('Weird')
elif 2 <= N & N <= 5:
    print('Not Weird')
elif 6 <= N & N <= 20:
    print('Weird')
else:
    print('Not Weird')

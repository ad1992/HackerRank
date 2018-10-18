#!/usr/bin/python3.5

import itertools

A=map(int,input().split())
B=map(int,input().split())

print(*itertools.product(A,B))

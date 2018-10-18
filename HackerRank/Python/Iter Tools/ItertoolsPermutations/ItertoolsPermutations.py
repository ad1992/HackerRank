#!/usr/bin/python3.5

import itertools

A=list(map(str,input().split()))
for i in list(itertools.permutations(sorted(str(A[0])),int(A[1]))):
    print(*i,sep="")

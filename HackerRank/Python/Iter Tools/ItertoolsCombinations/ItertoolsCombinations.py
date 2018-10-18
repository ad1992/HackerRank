#!/usr/bin/python3.5


import itertools

A=list(map(str,input().split()))
for i in range(1, int(A[1])+1):
    for k in itertools.combinations(sorted(str(A[0])),i):
        print(*k,sep="")

#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Enter your code here. Read input from STDIN. Print output to STDOUT
N=(int)(raw_input())
d={}
for i in range(0,N):
    iin=raw_input().split(" ")
    name=iin[0]
    #print name
    sum=float(iin[1])+float(iin[2])+float(iin[3])
    d[name]=sum*100/300

name=raw_input()

print '%.2f' %d[name]

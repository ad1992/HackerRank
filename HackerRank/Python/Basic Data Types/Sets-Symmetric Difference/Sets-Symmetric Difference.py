#!/usr/bin/env python
# -*- coding: utf-8 -*-

M=int(raw_input())
list1=map(int,raw_input().strip().split(" "))
N=int(raw_input())
list2=map(int,raw_input().strip().split(" "))
set1=set(list1)
set2=set(list2)
l1=(set1.difference(set2))
l2=(set2.difference(set1))
l3=sorted(l1.union(l2))
for i in l3:
    print i

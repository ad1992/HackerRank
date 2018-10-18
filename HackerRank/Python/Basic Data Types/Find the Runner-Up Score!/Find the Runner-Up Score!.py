#!/usr/bin/env python
# -*- coding: utf-8 -*-


N=int(raw_input())
list=list(set(map(int,raw_input().strip().split(" "))))
list.sort(reverse=True)
print list[1]

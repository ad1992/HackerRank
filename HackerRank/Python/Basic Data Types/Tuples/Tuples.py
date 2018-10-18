#!/usr/bin/env python
# -*- coding: utf-8 -*-

N=int(raw_input())
T=tuple(map(int,raw_input().strip().split(" ")))
print hash(T)

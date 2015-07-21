#!/usr/bin/env python
# -*- coding: utf-8 -*-

a = input()
b = map(int, raw_input().strip().split(" "))
xor=0
for i in b:
    xor^=i
print xor
    

#!/usr/bin/env python
# -*- coding: utf-8 -*-
import math

T=int(raw_input())
xor=long(math.pow(2, 32))-1
for i  in range (T):
    n=long(raw_input())
    print (xor^n)

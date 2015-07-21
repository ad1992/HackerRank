#!/usr/bin/env python
# -*- coding: utf-8 -*-
import math

L=int(raw_input())
R=int(raw_input())
xor=L^R
base2=int(math.log(xor,2))
ans=int(math.pow(2, base2+1))-1
print ans


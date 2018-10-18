#!/usr/bin/env python
# -*- coding: utf-8 -*-

X, Y, Z, N=(int(raw_input()) for i in range(4))
list=[[x,y,z] for x in range(X+1)  for y in range(Y+1) for z in range(Z+1) if x+y+z!=N]
print list

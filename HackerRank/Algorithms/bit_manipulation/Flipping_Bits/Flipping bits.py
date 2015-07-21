#!/usr/bin/env python
# -*- coding: utf-8 -*-
import math
'''
Problem Statement

You will be given a list of 32 bits unsigned integers. You are required to output the list of the unsigned integers you get by flipping bits in its binary representation (i.e. unset bits must be set, and set bits must be unset).

Input Format

The first line of the input contains the list size T, which is followed by T lines, each line having an integer from the list.

Constraints

1≤T≤100
0≤integer<232

Output Format

Output one line per element from the list with the requested result.
'''
T=int(raw_input())
xor=long(math.pow(2, 32))-1
for i  in range (T):
    n=long(raw_input())
    print (xor^n)

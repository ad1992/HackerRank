#!/usr/bin/python3.5

import string

def print_rangoli(size):
    # your code goes here
    # n, m = map(int,input().split())
    l=list(string.ascii_lowercase)
    m=[]
    for t in range(size):
        s = "-".join(l[t:size])
        m.append((s[::-1]+s[1:]).center(4*size-3, "-"))
    #print(m)
    # for i in m:
    #     print(i)
    print('\n'.join(m[:0:-1]+m))

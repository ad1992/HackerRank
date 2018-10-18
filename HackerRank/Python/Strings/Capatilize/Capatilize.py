#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(s):
    #k=s.split(" ")
    # l=s.partition(' ')[0]
    # print(l)
    l=list(s)
    l[0]=l[0].upper()
    for i in range(0,len(l)):
        if l[i] == " ":
            l[i+1]=l[i+1].upper()
    l="".join(l)
    return l

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    s = input()
    result = solve(s)
    fptr.write(result + '\n')
    fptr.close()

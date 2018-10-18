#!/usr/bin/env python
# -*- coding: utf-8 -*-

list=[]
N=(int)(raw_input())
for i in range(0,N):
    str=raw_input().strip('\ \r').split(" ")
    if str[0]=='print':
        print list
    elif len(str)==3:
        getattr(list,str[0])(int(str[1]),int(str[2]))
    elif len(str)==2:
        getattr(list,str[0])(int(str[1]))
    else:
         getattr(list,str[0])()

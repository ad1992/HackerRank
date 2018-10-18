#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/python-lists/problem

Task
You have to initialize your list L = [] and follow the N commands given in N lines.

Commands will be 1 of the 8 commands as given above, other than extend, and each command will have its value separated by space.

Follow this example:

Sample Input

12
insert 0 5
insert 1 10
insert 0 6
print
remove 6
append 9
append 1
sort
print
pop
reverse
print

#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
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

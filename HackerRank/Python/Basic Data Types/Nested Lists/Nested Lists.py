import operator
#!/usr/bin/env python
# -*- coding: utf-8 -*-

N=int(raw_input())
list1=[]
for i in range(N):
    list1.append([raw_input(),float(raw_input())])
max=list(set((x[1] for x in list1)))
max.sort()
marks=sorted(list1, key=operator.itemgetter(0, 1))
print ('\n'.join([m[0] for m in marks if m[1]==max[1]]))

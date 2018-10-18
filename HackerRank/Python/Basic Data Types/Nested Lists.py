import operator
#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/nested-list/problem

Problem Statement

Now we will see how to implement a nested list. There is a classroom of 'n' students and you are given their names and marks in physics. Store them in a nested list and print the name of each student who got the second lowest marks in physics.

NOTE: If there are more than one student getting same marks, make sure you print the names of all students in alphabetical order, in different lines.

Input Format

Integer N followed by alternating sequence of N strings and N numbers.

Output Format

Name of student.
'''
N=int(raw_input())
list1=[]
for i in range(N):
    list1.append([raw_input(),float(raw_input())])
max=list(set((x[1] for x in list1)))
max.sort()
marks=sorted(list1, key=operator.itemgetter(0, 1))
print ('\n'.join([m[0] for m in marks if m[1]==max[1]]))

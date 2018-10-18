#!/usr/bin python2
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/finding-the-percentage/problem
Problem Statement

There is a record of 'n' students, each record having name of student, percent marks obtained in Maths, Physics and Chemistry. Marks can be floating values. The user enters an integer 'n' followed by names and marks for the 'n' students. You are required to save the record in a dictionary data type. The user then enters name of a student and you are required to print the average percentage marks obtained by that student, correct to two decimal places.

Input Format

Integer N followed by name and marks for N students.

Output Format

Average percentage of marks obtained
'''
# Enter your code here. Read input from STDIN. Print output to STDOUT
N=(int)(raw_input())
d={}
for i in range(0,N):
    iin=raw_input().split(" ")
    name=iin[0]
    #print name
    sum=float(iin[1])+float(iin[2])+float(iin[3])
    d[name]=sum*100/300

name=raw_input()

print '%.2f' %d[name]

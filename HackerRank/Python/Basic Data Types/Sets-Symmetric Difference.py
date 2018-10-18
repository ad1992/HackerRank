#!/usr/bin/env python
# -*- coding: utf-8 -*-
'''
Problem link : https://www.hackerrank.com/challenges/symmetric-difference/problem?h_r=internal-search

Problem Statement

Lets learn about a new datatype 'sets'! You are given two set of integers M and N and you have to print their symmetric difference in ascending order. The first line of input contains value of M followed by M integers, then value of N followed by N integers. Symmetric difference between M and N mean those values which either exist in M or in N but not in both.

Input Format

Value of M followed by M integers, then value of N followed by N integers.

Output Format

Integers in ascending order, one per line.
'''
M=int(raw_input())
list1=map(int,raw_input().strip().split(" "))
N=int(raw_input())
list2=map(int,raw_input().strip().split(" "))
set1=set(list1)
set2=set(list2)
l1=(set1.difference(set2))
l2=(set2.difference(set1))
l3=sorted(l1.union(l2))
for i in l3:
    print i

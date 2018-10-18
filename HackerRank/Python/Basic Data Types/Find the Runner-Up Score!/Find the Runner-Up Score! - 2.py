#!/usr/bin/env python3.5
# -*- coding: utf-8 -*-


if __name__ == '__main__':
    n = int(input())
    arr =list(map(int, input().split(" ")))
    k = max(arr)
    for i in range(0,n):
        if max(arr) == k:
            arr.remove(max(arr))
    arr.sort(reverse=True)
    print(arr[0])

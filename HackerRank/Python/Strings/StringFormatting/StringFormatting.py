#!/usr/bin/python3.5

def print_formatted(number):
    width = len(str(bin(n)))-2
    for i in range(1,n+1):
        print(str(i).rjust(width),str(oct(i)[2:]).rjust(width),str(hex(i)[2:]).upper().rjust(width),str(bin(i)[2:]).rjust(width))

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)

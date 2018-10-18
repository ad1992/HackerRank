#!/usr/bin/python3.5

def minion_game(string):
    # your code goes here
    S=list(string.upper())
    Stuart=0
    Kevin=0
    for i in range(len(S)):
        if S[i] in 'AEIOU': Kevin = Kevin + (len(S)-i)
        else: Stuart = Stuart + (len(S)-i)
    if Kevin > Stuart: print("Kevin %d"% Kevin)
    elif Stuart > Kevin: print("Stuart %d"% Stuart)
    else: print("Draw")

if __name__ == '__main__':
    s = raw_input()
    minion_game(s)

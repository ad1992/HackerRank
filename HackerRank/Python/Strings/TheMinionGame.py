#!/usr/bin/python3.5

'''
Problem link : https://www.hackerrank.com/challenges/the-minion-game/problem

Kevin and Stuart want to play the 'The Minion Game'.

Game Rules

Both players are given the same string, .
Both players have to make substrings using the letters of the string .
Stuart has to make words starting with consonants.
Kevin has to make words starting with vowels.
The game ends when both players have made all possible substrings.

Scoring
A player gets +1 point for each occurrence of the substring in the string .

For Example:
String = BANANA
Kevin's vowel beginning word = ANA
Here, ANA occurs twice in BANANA. Hence, Kevin will get 2 Points.

For better understanding, see the image below:

[banana.png]

Your task is to determine the winner of the game and their score.

Input Format

A single line of input containing the string .
Note: The string will contain only uppercase letters: .

Constraints


Output Format

Print one line: the name of the winner and their score separated by a space.

If the game is a draw, print Draw.

Sample Input

BANANA

Sample Output

Stuart 12

Note :
Vowels are only defined as . In this problem, is not considered a vowel.
'''

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

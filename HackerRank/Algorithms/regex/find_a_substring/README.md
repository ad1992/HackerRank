#Find A Substring#

###Problem Statement###

A word made of a series of letters ( lower or upper ) or numerics or an underscore _ ( ascii value 95).

We define a substring as follows.

* It is a part of a word.
* The given substring must be preceeded and succeeded by letters or numerics or an underscore.

A word will be surrounded by 1 or more occurrences of non-letter, non-numeric and non-underscore ( not an underscore ) characters - or the beginning or end of a line on one side.  
``
<non letter, non-numeral ,non-underscore ><letters, numerals and underscore><non letter, non numerals, non underscore>
```
Given a sentence, can you find the total number of occurrences of the substring?

###Input Format###

First line is an integer N, N lines follow. Each line is a sentence as per the above definition.
Nth sentence is immediately followed by an integer T, T lines follow.
Each line has a lists a substring on which you need to perform the prescribed query which return the total number of occurrences of the substring.

###Constraints###

1 <= N <= 100
1 <= T <= 10

###Output format###

For every word, print the total number of occurrences of the substring in all of the N sentences provided as input.

###Sample Input###
```
1
existing pessimist optimist this is
1
is
```
###Sample Output###
```
3
```
###Explanation###

*    'existing' has 'is' as a substring and is both preceded and succeeded by words as defined above.
*    'pessimist' has 'is' as a substring for the same argument as above.
*    'optimist' has 'is' as a substring for the same argument as above.
*    'this' though has 'is' as a substring is only preceded by a word and is succeeded by a [blank space] which is non-letter, non-numeric and non-underscore
*    'is' is not included as it is preceded and succeeded by a [blank space] which is non-letter, non-numeric and non-underscore.


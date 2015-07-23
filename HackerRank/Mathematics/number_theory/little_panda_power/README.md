#Little Panda Power#

###Problem Statement###

Little Panda has a thing for powers and modulus and he likes challenges. His friend Lucy, however, is impractical and challenges Panda to find both positive and negative powers of a number modulo a particular number. We all know that A<sup>−1</sup>modX refers to the modular inverse of A modulo X.

Since Lucy is impractical, she says that A<sup>−n</sup>modX=(A<sup>−1</sup>modX)<sup>n</sup>modX for n>0.

Now she wants Panda to compute A<sup>B</sup>modX.

She also thinks that this problem can be very difficult if the constraints aren't given properly. Little Panda is very confused and leaves the problem to the worthy programmers of the world. Help him in finding the solution.

###Input Format###
The first line contains T, the number of test cases.
Then T lines follow, each line containing A, B and X.

###Output Format###
Output the value of A<sup>B</sup>modX.

###Constraints###
1≤T≤1000  
1≤A≤10<sup>6  
−10<sup>6</sup>≤B≤10<sup>6</sup>  
1≤X≤10<sup>6</sup>  
A and X are coprime to each other (see Wikipedia)

###Sample Input###
```
3  
1 2 3  
3 4 2  
4 -1 5
```
###Sample Output###
```
1  
1  
4  
```
###Explanation###
Case 1: 1<sup>2</sup>mod3=1mod3=1  
Case 2: 3<sup>4</sup>mod2=81mod2=1  
Case 3: 4<sup>−1</sup>mod5=4  
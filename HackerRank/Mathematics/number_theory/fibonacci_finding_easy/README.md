#Fibonacci Finding (easy)#


###Problem Statement###

You're given three numbers: A, B, and N, and all you have to do is to find the number F<sub>N</sub> where  
F<sub>0</sub>=A  
F<sub>1</sub>=B  
F<sub>i</sub>=F<sub>i−1</sub>+F<sub>i−2</sub> for i≥2  

As the number can be very large, output it modulo 10<sup>9</sup>+7.

###Input Format###
First line contains a single integer T - the number of tests. T lines follow, each containing three integers: A, B and N.

###Constraints###
1≤T≤1000  
1≤A,B,N≤10<sup>9</sup>  

###Output Format###
For each test case output a single integer − F<sub>N</sub>

###Sample Input###
```
8  
2 3 1  
9 1 7  
9 8 3  
2 4 9  
1 7 2  
1 8 1  
4 3 1  
3 7 5  
```
###Sample Output###
```
3  
85  
25  
178  
8  
8  
3  
44
```
###Explanation###
First test case is obvious.
Let's look through the second one:
F<sub>0</sub>=9  
F<sub>1</sub>=1  
F<sub>2</sub>=1+9=10  
F<sub>3</sub>=10+1=11  
F<sub>4</sub>=11+10=21  
F<sub>5</sub>=21+11=32  
F<sub>6</sub>=32+21=53  
F<sub>7</sub>=53+32=85  

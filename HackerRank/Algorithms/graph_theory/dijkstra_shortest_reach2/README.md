#Dijkstra: Shortest Reach 2#


###Problem Statement###

Given a graph consisting N nodes (labelled 1 to N) where a specific given node S represents the starting position S and an edge between two nodes is of a given length, which may or may not be equal to other lengths in the graph.

It is required to calculate the shortest distance from the start position (Node S) to all of the other nodes in the graph.

Note 1: If a node is unreachable , the distance is assumed as −1.

###Input Format###

The first line contains T, denoting the number of test cases.
First line of each test case has two integers N, denoting the number of nodes in the graph and M, denoting the number of edges in the graph.

The next M lines each consist of three space separated integers x y r, where x and y denote the two nodes between which the undirected edge exists, r denotes the length of edge between these corrresponding nodes.

The last line has an integer S, denoting the starting position.

###Constraints###
1≤T≤10  
2≤N≤3000  
1≤M≤(N×(N−1))/2  
1≤x,y,S≤N  
1≤r≤350  

If there are edges between the same pair of nodes with different weights, they are to be considered as is, like multiple edges.

###Output Format###

For each of the T test cases, print a single line consisting N−1 space separated integers denoting the shortest distance of N−1 nodes from starting position S.

For unreachable nodes, print −1.

###Sample Input###
```
1
4 4
1 2 24
1 4 20
3 1 3
4 3 12
1
```
###Sample Output###
```
24 3 15
```
###Explanation###

The graph given in the test case is shown as :  
<img src="http://drive.google.com/uc?export=download&amp;id=0B_UrJ0h5_x_mTHdneVNUQ1RGc1E">       


*   The straight line is a weighted edge, denoting length of edge between the corresponding nodes.
*   The nodes S,B,C and D denote the obvious node 1,2,3 and 4 in the test case.

The shortest paths followed for the three nodes B,C and D are as follows :

**S->B** - Shortest Path Value : 24

**S->C** - Shortest Path Value : 3

**S->C->D** - Shortest Path Value : 15
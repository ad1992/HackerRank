#Prim's (MST) : Special Subtree#

###Problem Statement###

Given a graph which consists of several edges connecting the N nodes in it.
It is required to find a subgraph of the given graph with the following properties:

*    The subgraph contains all the nodes present in the original graph.
*    The subgraph is of minimum overall weight (sum of all edges) among all such subgraphs.
*   It is also required that there is exactly one, exclusive path between any two nodes of the subgraph.

One specific node S is fixed as the starting point of finding the subgraph.
Find the total weight of such a subgraph (sum of all edges in the subgraph)

###Input Format###

First line has two integers N, denoting the number of nodes in the graph and M, denoting the number of edges in the graph.  

The next M lines each consist of three space separated integers x y r, where x and y denote the two nodes between which the undirected edge exists, r denotes the length of edge between the corresponding nodes.  

The last line has an integer S, denoting the starting node.  

###Constraints###
2≤N≤3000  
1≤M≤(N∗(N−1))/2  
1≤x,y,S≤N  
0<=r<=10<sup>5</sup>  
If there are edges between the same pair of nodes with different weights, they are to be considered as is, like multiple edges.  

###Output Format###

Print a single integer denoting the total weight of tree so obtained (sum of weight of edges).

###Sample Input###
```
5 6
1 2 3
1 3 4
4 2 6
5 2 2
2 3 5
3 5 7
1
```
###Sample Output###
```
15
```
###Explanation###

The graph given in the test case is shown as :  

<img src="http://drive.google.com/uc?export=download&amp;id=0B_UrJ0h5_x_mQkJzQTZVMTBQMFk">  


*    The nodes A,B,C,D and E denote the obvious 1,2,3,4 and 5 node numbers.

*    The starting node is A or 1 (in the given test case)

Applying the Prim's algorithm, edge choices available at first are :  

A->B (WT. 3) and A->C (WT. 4) , out of which A->B is chosen (smaller weight of edge).  

Now the available choices are :  

A->C (WT. 4) , B->C (WT. 5) , B->E (WT. 2) and B->D (WT. 6) , out of which B->E is chosen by the algorithm.  

Following the same method of the algorithm, the next chosen edges , sequentially are :  

A->C and B->D.  

Hence the overall sequence of edges picked up by prims are:  

A->B : B->E : A->C : B->D  

and Total weight of the hence formed MST is : 15   

#Kruskal (MST): Really Special Subtree#

###Problem Statement###

Given an undirected weighted graph, it is required to find the Really Special SubTree in it. The Really Special SubTree is defined as a subgraph consisting of all the nodes in the graph and  

*    There is only one exclusive path from a node to every other node.
*    The subgraph is of minimum overall weight (sum of all edges) among all such subgraphs.
*    While creating the Really Special SubTree, start of by picking the edge with smallest weight. If there are edges of equal weight available at an instant, then the edge to be chosen first among them is the one with minimum value of sum of the following expression :
       *  u + wt + v , where u-v are the node numbers of the corresponding edge and wt is the weight.
*    Even then if there is a collision, choose any one of them.
*    While doing the above, ensure that no cycle is formed while picking up edges.  

Finally, you need to print the overall weight of the Christmas Tree so formed using above rules.

###Input Format###

First line has two integers N, denoting the number of nodes in the graph and M, denoting the number of edges in the graph.  

The next M lines each consist of three space separated integers x y r, where x and y denote the two nodes between which the undirected edge exists, r denotes the weight of edge between the corresponding nodes.  

The last line has an integer S, denoting the starting node.  

###Constraints###
1≤T≤10  
2≤N≤3000  
1≤M≤(N∗(N−1))/2  
1≤x,y,S≤N  
0≤r≤10<sup>5</sup>    

If there are edges between the same pair of nodes with different weights, they are to be considered as is, like multiple edges.  

###Output Format###

Print a single integer deonting the total weight (sum of weights of all edges in the MST) of the Really Special SubTree.

###Sample Input###
```
4 6
1 2 5
1 3 3
4 1 6
2 4 7
3 2 4
3 4 5
1
```
###Sample Output###
```
12
```
###Explanation###

The graph given in the test case is shown as :  

<img src="http://drive.google.com/uc?export=download&amp;id=0B_UrJ0h5_x_ma3kyTEI4VWpCczQ">  

*    The nodes A,B,C and D denote the obvious 1,2,3 and 4 node numbers.

*    The starting node is A or 1 (in the given test case)

Applying the Kruskal's algorithm, all the edges are sorted in ascending order of weight.  

After sorting, the edge choices are available as :  

A->C (WT. 3) , B->C (WT. 4) , A->B (WT. 5) , C->D (WT. 5) , A->D (WT. 6) and B->D (WT. 7)  

Picking these edges and finalizing only if it doesnt create a cycle :  

A->C : B->C  

Now, when A->B edge is picked , it can be easily seen that they both belong to same set (form a cycle) and hence this edge is ignored.  

The process continues and the following edge sequence is formed for the MST :  

A->C : B->C : C->D  

and Total weight of the hence formed Really Special SubTree is : 12   
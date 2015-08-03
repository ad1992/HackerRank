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
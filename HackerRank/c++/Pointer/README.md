This problem link: [Pointer](https://www.hackerrank.com/challenges/c-tutorial-pointer/problem)


A pointer in C is a way to share a memory address among different contexts (primarily functions). They are primarily used whenever a function needs to modify the content of a variable, of which it doesn't have ownership.

In order to access the memory address of a variable, , we need to prepend it with sign. E.g., &val returns the memory address of .

This memory address is assigned to a pointer and can be shared among various functions. E.g. will assign the memory address of to pointer . To access the content of the memory to which the pointer points, prepend it with a *. For example, *p will return the value reflected by and any modification to it will be reflected at the source ().

void increment(int *v) {
    (*v)++;
}

int main() {
    int a;
    scanf("%d", &a);
    increment(&a);
    printf("%d", a);
    return 0;
}  

You have to complete the function void update(int *a,int *b), which reads two integers as argument, and sets with the sum of them, and with the absolute difference of them.

Input Format

Input will contain two integers, and , separated by a newline.

Output Format

You have to print the updated value of and , on two different lines.


P.S.: Input/ouput will be automatically handled. You only have to complete the void update(int *a,int *b) function.

Sample Input

4
5

Sample Output

9
1

Explanation

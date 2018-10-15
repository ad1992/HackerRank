#include <stdio.h>

void update(int *a,int *b) {
    // Complete this function
    int t = *a+*b;
    int l = *b-*a;
    if(0>l){
        l=-1 * l;
    }
    *a=t;
    *b=l;
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;

    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}

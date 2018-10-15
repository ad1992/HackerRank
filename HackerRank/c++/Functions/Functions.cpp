#include <iostream>
#include <cstdio>
using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a,int b,int c, int d){
    int t[4]={a,b,c,d};
    int z=0;
    for(int i=0;i<4;i++){
        if(z<t[i]){
            z=t[i];
        }
    }
    return z;
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);

    return 0;
}

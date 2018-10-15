#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int limit,temp;
    cin >> limit;
    int a[limit];
    int l[limit];
    for(int i=0;i<limit;i++){
        cin >> a[i];
    }
    for (int i = 0; i < limit/2; ++i) {
    temp = a[limit-i-1];
    a[limit-i-1] = a[i];
    a[i] = temp;
}
    for (int i = 0; i < limit; ++i) {
    cout << a[i] << " ";
}
    return 0;
}

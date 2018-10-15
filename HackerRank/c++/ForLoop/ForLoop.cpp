#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int a,b;
    int n=0;
    cin >> a >> b;
    string z[9]={"one","two","three","four","five","six","seven","eight","nine"};
    if (a <= 9 && b <= 9 ){
        for(n=a;n<=b;n++){
            cout << z[n-1] << endl;
        }
    }else if( a <= 9 && b > 9){
        for(n=a;n<=9;n++){
            cout << z[n-1] << endl;
        }
                for(n=10;n<=b;n++){
            if (n%2==0){
                cout<<"even"<<endl;
            }
             else {
                 cout<<"odd"<<endl;
             }
         }
    }

    return 0;
}

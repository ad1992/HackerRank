#include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string str1,str2;
    cin >> str1;
    cin >> str2;
    int l1 = str1.size();
    int l2 = str2.size();
    cout << l1 << " " << l2 << endl ;
    string str3 = str1 + str2;
    cout << str3 << endl;
    char a = str1[0];
    str1[0] = str2[0];
    str2[0] = a;
    str3 = str1 + " " +str2;
    cout << str3;
    return 0;
}

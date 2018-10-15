#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
	// Complete this function
    stringstream vectorlist(str);
    vector<int> answer;
    int temporary;
    char change;
    while(vectorlist >> temporary){
        answer.push_back(temporary);
        vectorlist >> change;
    }
    return answer;

}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }

    return 0;
}

#include<iostream>

using namespace std;

int main(){
	int t;
	long long int p;
    cin >> t;
    for(int i = 0; i < t; i++){
	   cin >> p;
       if(p == 1){
       	cout << p << endl;
       }else if(p % 2 == 0){
       	cout << p/2 << endl;
       }else{
       	cout << (p/2)+1 << endl;
       }
    }
   return 0;
}
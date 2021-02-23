#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	
	int n, r, x;
 
	bool verify;

	while(cin >> n >> r) {
		vector<int> vetor(n + 1);
		verify = false;

		for (int i = 0; i < r; ++i){
			cin >> x;
			vetor[x] = 1;
  		}

  		for (int i = 1; i <= n; ++i){
   			if(vetor[i] == 0){
    			vetorerify = true;
    			cout << i << " ";
   			}
  		}

  		if(verify == false){
  			cout << '*';	
		} 

  		cout << endl;
 	}

 	return 0;
}
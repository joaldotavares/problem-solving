#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int t, t2, l, a, b, n;
    
    while (cin >> n >> t >> l) {
        a = 0;
		b = 0;
        int v = 0;
        
        for (int i = 1; i < n ; ++i) {
            cin >> t2;
            if (abs(t - t2) <= l) {
                if (v){
                	b += (abs(t - t2));	
				}else {
					a += (abs(t - t2));	
				}
                t = t2;
            }
            
            v ^= 1;
        }
        
        cout << a << ' ' << b << endl;
    }
}

#include <bits/stdc++.h>

using namespace std;
typedef long long ll;
int main(int argc, char const *argv[])
{
	
	int n;
	cin >> n;
	vector<ll> v(n);
	for(int arr_i = 0; arr_i < n; arr_i++){
		cin >> v[arr_i];
	}
	ll result = solution(v);
	cout << result ;
	return 0;
}

ll solution (vector<ll> v){
	ll result;
	for ( int n = v.size - 1; n >= 0; n-- ){
		result += v[n];
	}
	return result;
}
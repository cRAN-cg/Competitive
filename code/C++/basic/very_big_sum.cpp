#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
typedef long long ll;

ll solve(vector<ll> v, int length){
  ll result = 0;
  for (int n = length-1; n >= 0; n--){
    result += v[n];
  }
  return result;
}


int main(){
    int n;
    cin >> n;
    vector<ll> arr(n);
    for(int arr_i = 0;arr_i < n;arr_i++){
       cin >> arr[arr_i];
    }
    ll result =  solve(arr, n);
    cout << result ;
    return 0;
}


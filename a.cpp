#include <bits/stdc++.h>
using namespace std;
int main() {
    #ifndef ONLINE_JUDJE
        freopen("i.txt", "r", stdin);
        freopen("o.txt", "w", stdout);
    #endif

    int a, b, c;
    cin >> a >> b >> c;
    
    if (a>b) {
      if (a>c) {
        cout << a << endl;
      } else {
        cout << c << endl;
      }
    } else {
      if (b>c) {
        cout << b << endl;
      } else {
        cout << c << endl;
      }
    }

  return 0;
}
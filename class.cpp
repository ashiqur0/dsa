#include <iostream>
using namespace std;

class myClass {
    public:
    string name;
    int roll;
};

struct s {
    int num;
    string name;
};


int main() {

    myClass obj;
    obj.roll = 9;
    obj.name = "Ashiqur";
    cout << obj.name << " " << obj.roll << endl;

    s s1;
    s1.num = 5;
    s1.name = "Fahim";
    cout << s1.name << " " << s1.num << endl;

    return 0;
}
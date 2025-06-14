#include <iostream> 
using namespace std;

struct Node {
    int data;
    Node* next;
    Node(int value) : data(value), next(nullptr) {};
};

void display(Node* head) {
    while(head) {
        cout << head -> data << " -> ";
        head = head -> next;
    }
    cout << "nullptr" << endl;
}

void deletelist(Node*& head) {
    while(head) {
        Node* temp = head;
        head = head -> next;
        delete temp;
    }
}

Node* reverselist(Node* head) {
    Node* prev = nullptr;
    Node* curr = head;
    Node* next = nullptr;
    while(curr) {
        next = curr -> next;
        curr -> next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

int main() {

    Node* head = new Node(1);
    head -> next = new Node(2);
    head -> next -> next = new Node(3);
    head -> next -> next -> next = new Node(4);

    cout << "Original List: ";
    display(head);
    
    head = reverselist(head);
    cout << "Reverse List: ";
    display(head);

    deletelist(head);

    if(!head) {
        cout << "List deleted successfully" << endl;
    } else {
        cout << "List not yeat deleted" << endl;
    }

    return 0;
}
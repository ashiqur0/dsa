//  Singly Linked List

#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
};

void insert(Node*& head, int value) {
    Node* newNode = new Node{value, nullptr};
    if(!head) {
        head = newNode;
    } else {
        Node* temp = head;
        while(temp -> next) {
            temp = temp -> next;
        }
        temp -> next = newNode;
    }
}

void deletelist(Node*& head) {
    while(head) {
        Node* temp = head;
        head = head -> next;
        delete temp;
    }
}

void display(Node* head) {
    while(head) {
        cout << head -> data << " -> ";
        head = head -> next;
    }
    cout << "nullptr" << endl;
}

int main() {

    Node* head = nullptr;
    insert(head, 1);
    insert(head, 2);
    insert(head, 3);
    insert(head, 4);

    display(head);
    deletelist(head);

    return 0;
}
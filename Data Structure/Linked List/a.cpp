// Doubly Linked List
#include <iostream>
using namespace std;

struct Node {
    int data;
    Node* next;
    Node* prev;
};

void insert(Node*& head, int value) {
    Node* newNode = new Node{value, nullptr, nullptr};
    if(!head) {
        head = newNode;
    } else {
        Node* temp = head;
        while(temp -> next) {
            temp = temp -> next;
        }
        temp -> next = newNode;
        newNode -> prev = temp;
    }
}

void deletelist(Node*& head) {
    while(head) {
        Node* temp = head;
        head = head -> next;
        delete temp;
    }
}

void displayForword(Node* head) {
    while(head) {
        cout << head -> data << " <-> ";
        head = head -> next;
    }
    cout << "nullptr" << endl;
}

void displayBackword(Node* tail) {
    while(tail) {
        cout << tail -> data << " <-> ";
        tail = tail -> prev;
    }
    cout << "nullptr" << endl;
}

int main() {

    Node* head = nullptr;
    insert(head, 1);
    insert(head, 2);
    insert(head, 3);

    Node* tail = head;
    while(tail -> next) {
        tail = tail -> next;
    }
    
    displayForword(head);
    displayBackword(tail);
    deletelist(head);

    return 0;
}
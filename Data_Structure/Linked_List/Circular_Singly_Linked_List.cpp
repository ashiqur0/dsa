// Circular Singly Linked List

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
        newNode -> next = head;
    } else {
        Node* temp = head;
        while(temp -> next != head) {
            temp = temp -> next;
        }
        temp -> next = newNode;
        newNode -> next = head;
    }
}

void deletelist(Node*& head) {
    if(!head) return;
    Node* temp = head;
    do {
        Node* next = temp -> next;
        delete temp;
        temp = next;
    } while(temp != head);
    head = nullptr;
}

void display(Node* head) {
    if(!head) return;
    Node* temp = head;
    do {
        cout << temp -> data << " -> ";
        temp = temp -> next;
    } while(temp != head);
    cout << "back to head" << endl;
}

int main() {

    Node* head = nullptr;
    insert(head, 1);
    insert(head, 2);
    insert(head, 3);

    display(head);
    deletelist(head);
    if(!head) {
        cout << "list delete successfully" << endl;
    }

    return 0;
}
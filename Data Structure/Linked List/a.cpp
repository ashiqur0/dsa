#include <bits/stdc++.h>
using namespace std;

// Node structure for singly linked list
struct Node {
    int data;
    Node* next;
};

// insertion of linked list value
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
void insert2(Node*& head, int value) {
    Node* newNode = new Node{value, nullptr};
    if (!head) {
        head = newNode;
    } else {
        Node* temp = head;
        while(temp -> next) {
            temp = temp -> next;
        }
        temp -> next = newNode;
    }
}

// display all the elements
void display(Node* head) {
    while(head) {
        cout << head -> data << " -> ";
        head = head -> next;
    }
    cout << "nullptr" << endl;
}
void display2(Node* head) {
    while(head) {
        cout << head -> data << " -> ";
        head = head -> next;
    }
    cout << "nullptr" << endl;
}

// display list to free memory
void deletelist(Node*& head) {
    while(head) {
        Node* temp = head;
        head = head -> next;
        delete temp;
    }
}
void deletelist2(Node*& head) {
    while(head) {
        Node* temp = head;
        head = head -> next;
        delete temp;
    }
}

int main() {
    Node* head = nullptr;
    insert2(head, 100);
    insert2(head, 200);
    insert2(head, 300);
    insert2(head, 400);

    display2(head);
    deletelist2(head);
}
int main2() {

    Node* head = nullptr;
    insert(head, 10);
    insert(head, 20);
    insert(head, 30);
    insert(head, 40);

    display(head);
    deletelist(head);

  return 0;
}
// Circular Doubly Linked List

#include <iostream>
using namespace std;

// Node structure for doubly circular linked list
struct Node {
    int data;
    Node* next;
    Node* prev;
};

// Insert a new node at the end of the list
void insert(Node*& head, int value) {
    Node* newNode = new Node{value, nullptr, nullptr};
    if (!head) {
        head = newNode;
        newNode->next = head;
        newNode->prev = head;
    } else {
        Node* tail = head->prev;
        tail->next = newNode;
        newNode->prev = tail;
        newNode->next = head;
        head->prev = newNode;
    }
}

// Display all elements of the list
void display(Node* head) {
    if (!head) return;
    Node* temp = head;
    do {
        cout << temp->data << " <-> ";
        temp = temp->next;
    } while (temp != head);
    cout << "(back to head)\n";
}

// Delete the list to free memory
void deleteList(Node*& head) {
    if (!head) return;
    Node* temp = head;
    do {
        Node* next = temp->next;
        delete temp;
        temp = next;
    } while (temp != head);
    head = nullptr;
}

int main() {
    Node* head = nullptr;
    insert(head, 10);
    insert(head, 20);
    insert(head, 30);

    cout << "Doubly Circular Linked List: ";
    display(head);

    deleteList(head);
    return 0;
}
// Circular Singly Linked List

#include <iostream>
using namespace std;

// Node structure for circular singly linked list
struct Node {
    int data;
    Node* next;
};

// Insert a new node at the end of the list
void insert(Node*& head, int value) {
    Node* newNode = new Node{value, nullptr};
    if (!head) {
        head = newNode;
        newNode->next = head;
    } else {
        Node* temp = head;
        while (temp->next != head) {
            temp = temp->next;
        }
        temp->next = newNode;
        newNode->next = head;
    }
}

// Display all elements of the list
void display(Node* head) {
    if (!head) return;
    Node* temp = head;
    do {
        cout << temp->data << " -> ";
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

    cout << "Circular Singly Linked List: ";
    display(head);

    deleteList(head);
    return 0;
}
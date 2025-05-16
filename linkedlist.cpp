#include <iostream>
using namespace std;

// Define a Node
struct Node {
    int data;       // Data part
    Node* next;     // Pointer to the next node
};

// Function to add a new node at the end of the list
void appendNode(Node*& head, int value) {
    Node* newNode = new Node(); // Create a new node
    newNode->data = value;      // Set the data
    newNode->next = nullptr;    // Set the next pointer to null

    if (head == nullptr) {      // If the list is empty, make newNode the head
        head = newNode;
        return;
    }

    Node* temp = head;
    while (temp->next != nullptr) { // Traverse to the last node
        temp = temp->next;
    }
    temp->next = newNode;        // Link the last node to the newNode
}

// Function to print the linked list
void printList(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

// Function to delete the linked list and free memory
void deleteList(Node*& head) {
    Node* temp;
    while (head != nullptr) {
        temp = head;
        head = head->next;
        delete temp;
    }
    cout << "List deleted successfully." << endl;
}

int main() {
    Node* head = nullptr; // Initialize an empty list

    // Append some nodes
    appendNode(head, 10);
    appendNode(head, 20);
    appendNode(head, 30);

    // Print the linked list
    cout << "Linked List: ";
    printList(head);

    // Delete the linked list
    deleteList(head);

    return 0;
}
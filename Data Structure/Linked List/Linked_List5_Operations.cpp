// Linked List Operations

#include <iostream>
#include <algorithm> // For std::sort
#include <vector>    // For auxiliary use in sorting
using namespace std;

struct Node {
    int data;
    Node* next;
};

// Insert at the end
void insert(Node*& head, int value) {
    Node* newNode = new Node{value, nullptr};
    if (!head) {
        head = newNode;
    } else {
        Node* temp = head;
        while (temp->next) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
}

// Traverse and display the list
void traverse(Node* head) {
    while (head) {
        cout << head->data << " -> ";
        head = head->next;
    }
    cout << "nullptr\n";
}

// Remove an element
void remove(Node*& head, int value) {
    if (!head) return;
    if (head->data == value) {
        Node* temp = head;
        head = head->next;
        delete temp;
        return;
    }
    Node* temp = head;
    while (temp->next && temp->next->data != value) {
        temp = temp->next;
    }
    if (temp->next) {
        Node* toDelete = temp->next;
        temp->next = temp->next->next;
        delete toDelete;
    }
}

// Sort the list
void sortList(Node*& head) {
    if (!head || !head->next) return;
    vector<int> elements;
    Node* temp = head;
    while (temp) {
        elements.push_back(temp->data);
        temp = temp->next;
    }
    std::sort(elements.begin(), elements.end());
    temp = head;
    for (int value : elements) {
        temp->data = value;
        temp = temp->next;
    }
}

int main() {
    Node* head = nullptr;
    insert(head, 30);
    insert(head, 10);
    insert(head, 20);

    cout << "Original List: ";
    traverse(head);

    remove(head, 10);
    cout << "After Removing 10: ";
    traverse(head);

    sortList(head);
    cout << "After Sorting: ";
    traverse(head);

    return 0;
}
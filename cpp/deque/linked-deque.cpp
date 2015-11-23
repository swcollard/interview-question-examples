// - - - - - 
// Implementation of a deque (double queue) using a doubly linked list
// - - - - -

#include <iostream>
#include <exception>

struct node {
    node* prev;
    node* next;
    int val;
};

class dequeu {
  private:
    int size;
    node* first;
    node* last;

    void init(int value) {
        size = 1;
        node* ptr = new node();
        first = ptr;
        last = ptr;
        ptr->val = value;
    }

  public:
    dequeu() {
        size = 0;
        first = NULL;
        last = NULL;
    }

    void insertLast(int value) {
        if (isEmpty()) {
            init(value);
            return;
        }
        node* ptr = new node();
        ptr->val = value;
        ptr->prev = last;
        last->next = ptr;
        last = ptr;
        size++;
    }

    int removeLast() {
        if (isEmpty()) {
            throw new std::exception();
        }
        node* ptr = last;
        last = last->prev;
        size--;
        return ptr->val;
    }

    void insertFirst(int value) {
        if (isEmpty()) {
            init(value);
            return;
        }
        node* ptr = new node();
        ptr->val = value;
        ptr->next = first;
        first->prev = ptr;
        first = ptr;
        size++;
    }

    int removeFirst() {
        if (isEmpty()) {
            throw new std::exception();
        }
        node* ptr = first;
        first = first->next;
        size--;
        return ptr->val;
    }

    int count() {
        return size;
    }

    bool isEmpty() {
        return size == 0;
    }

    void print() {
        node* ptr = first;
        for (int i = 0; i < size; i++) {
            std::cout<<ptr->val<<' ';
            ptr = ptr->next;
        }
        std::cout<<std::endl;
    }
};

int main() {

    std::cout<<"Hello"<<std::endl;

    dequeu* d = new dequeu();

    d->insertLast(1);
    d->insertLast(2);
    d->insertLast(3);
    d->insertFirst(4);
    d->print();
    d->removeLast();
    d->print();
    d->removeFirst();
    d->print();
}

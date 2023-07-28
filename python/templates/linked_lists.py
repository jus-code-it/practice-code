class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def insert_at_beginning(self, data):
        new_node = Node(data)
        if self.head is not None:
            self.head.prev = new_node
        new_node.next = self.head
        self.head = new_node

    def insert_at_end(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
            return

        current = self.head
        while current.next is not None:
            current = current.next

        current.next = new_node
        new_node.prev = current

    def insert_at_position(self, position, data):
        new_node = Node(data)
        if position == 1:
            self.insert_at_beginning(data)
            return

        current = self.head
        for _ in range(1, position):
            if current is None:
                print("Invalid position. Insertion failed.")
                return
            current = current.next

        if current is None:
            print("Invalid position. Insertion failed.")
            return

        # Relinking the nodes
        new_node.next = current
        current.prev.next = new_node
        new_node.prev = current.prev
        current.prev = new_node

    def delete_node(self, key):
        current = self.head

        while current is not None:
            if current.data == key:
                if current.prev is not None:
                    current.prev.next = current.next
                else:
                    self.head = current.next

                if current.next is not None:
                    current.next.prev = current.prev

                return

            current = current.next

    def reverse(self):
        prev_node = None
        current = self.head

        while current is not None:
            next_node = current.next
            current.next = prev_node
            current.prev = next_node
            prev_node = current
            current = next_node

        self.head = prev_node

    def display(self):
        current = self.head
        while current is not None:
            print(current.data, end=' ')
            current = current.next
        print()


# Example usage:
if __name__ == "__main__":
    doubly_linked_list = DoublyLinkedList()

    # Insertion
    doubly_linked_list.insert_at_beginning(10)
    doubly_linked_list.insert_at_beginning(20)
    doubly_linked_list.insert_at_end(30)
    doubly_linked_list.insert_at_end(40)
    doubly_linked_list.insert_at_position(3, 6)

    print("Doubly Linked List after Insertion:")
    doubly_linked_list.display()

    # Deletion
    doubly_linked_list.delete_node(30)

    print("Doubly Linked List after Deletion:")
    doubly_linked_list.display()

    # Reversal
    doubly_linked_list.reverse()

    print("Doubly Linked List after Reversal:")
    doubly_linked_list.display()

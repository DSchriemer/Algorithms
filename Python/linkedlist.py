#Sample linked list written in Python
#David Schriemer
#To run go to command line and type 'python linkedlist.py'

class Node: #Primary node class
    def __init__(self, value):
        self.value = value
        self.next = None


    def traverse(self):
        node = self
        while node != None:
            print node.value
            node = node.next

node1 = Node(12)
node2 = Node(99)
node3 = Node(37)
node1.next = node2 # 12->99
node2.next = node3 # 99->37

node1.traverse()
